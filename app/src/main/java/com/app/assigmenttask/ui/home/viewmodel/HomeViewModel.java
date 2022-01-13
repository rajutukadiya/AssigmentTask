package com.app.assigmenttask.ui.home.viewmodel;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.app.assigmenttask.repository.UserRepository;
import com.app.assigmenttask.data.response.ResponseRestaurant;
import com.app.assigmenttask.utils.SingleLiveEvent;

import java.util.List;

import static org.koin.java.KoinJavaComponent.inject;

import kotlin.Lazy;

public class HomeViewModel extends ViewModel {

    ObservableBoolean showLoading;
    MutableLiveData<List<ResponseRestaurant.Datum>> restaurantList;
    SingleLiveEvent<String> showError;

    public Lazy<UserRepository> userRepository = inject(UserRepository.class);

    public HomeViewModel() {
        getAllRestaurants();
    }

    private void getAllRestaurants() {
        showLoading.set(true);

       /* val result =  userRepository.getAllRestaurants(ReqRestaurants(16.230136,74.3603665,1))

        showLoading.set(false)
        when (result) {
            is AppResult.Success -> {
                restaurantList.postValue(result.successData.data.restaurants.data)
                showError.value = null
            }
            is AppResult.Error -> showError.value = result.exception.message
        }*/
    }

}
