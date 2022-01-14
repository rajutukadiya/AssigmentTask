package com.app.assigmenttask.di

import android.app.Application
import androidx.room.Room
import com.app.assigmenttask.BuildConfig.DEBUG
import com.app.assigmenttask.R
import com.app.assigmenttask.api.ApiService
import com.app.assigmenttask.api.HostSelectionInterceptor
import com.app.assigmenttask.core.MainApp
import com.app.assigmenttask.db.AppDatabase
import com.app.assigmenttask.db.dao.UsersDao
import com.app.assigmenttask.repository.UserRepository
import com.app.assigmenttask.repository.UserRepositoryImpl
import com.app.assigmenttask.ui.home.viewmodel.HomeViewModel
import com.app.assigmenttask.ui.login.viewmodel.LoginViewModel
import com.app.assigmenttask.ui.register.viewmodel.RegisterViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@JvmField
val appContext = module {
    single(named("appContext")) { androidContext() }
}

@JvmField
val apiModule = module {

    fun provideApi(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
    single { provideApi(get()) }

}

@JvmField
val databaseModule = module {

    fun provideDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "Practical")
            .fallbackToDestructiveMigration()
            .build()
    }

    fun provideUsersDao(database: AppDatabase): UsersDao {
        return database.userDao()
    }

    single { provideDatabase(androidApplication()) }
    single { provideUsersDao(get()) }

}

@JvmField
val networkModule = module {
    val connectTimeout: Long = 40// 20s
    val readTimeout: Long = 40 // 20s

    fun provideHttpClient(interceptors: List<HostSelectionInterceptor>): OkHttpClient {
        val okHttpClientBuilder = OkHttpClient.Builder()
            .connectTimeout(connectTimeout, TimeUnit.SECONDS)
            .readTimeout(readTimeout, TimeUnit.SECONDS)
        if (DEBUG) {
            val httpLoggingInterceptor = HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }
            okHttpClientBuilder.addInterceptor(httpLoggingInterceptor)
        }
        interceptors.forEach { okHttpClientBuilder.addInterceptor(it) }
        okHttpClientBuilder.build()
        return okHttpClientBuilder.build()
    }

    fun provideRetrofit(client: OkHttpClient, baseUrl: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(client)
            .build()
    }

    single {
        HostSelectionInterceptor()
    }
    single { provideHttpClient(interceptors = listOf(get())) }
    single {
        val baseUrl = androidContext().getString(R.string.base_url)
        provideRetrofit(get(), baseUrl)
    }
}

@JvmField
val repositoryModule = module {

    fun provideUserRepository(dao: UsersDao): UserRepository {
        return UserRepositoryImpl(dao)
    }

//    fun provideRestaurantsRepository(
//        apiService: ApiService,
//        context: Context
//    ): RestaurantRepository {
//        return RestaurantRepositoryImpl(apiService, context)
//    }

    single { provideUserRepository(get()) }
//    single { provideRestaurantsRepository(get(), get()) }

}

@JvmField
val viewModelModule = module {

    // Specific viewModel pattern to tell Koin how to build CountriesViewModel
    viewModel {
        LoginViewModel(get())
    }

    viewModel {
        RegisterViewModel(get())
    }

    viewModel {
        HomeViewModel()
    }

//    viewModel {
//        SeatedViewModel(get())
//    }
//
//    viewModel {
//        TableViewModel(get())
//    }
}

fun startKoinApp(application: MainApp) {
    startKoin {
        androidLogger() //This one is causing the crash
        androidContext(application)
        modules(
            listOf(
                apiModule,
                appContext,
                databaseModule,
                viewModelModule,
                repositoryModule,
                networkModule
            )
        )
    }
}