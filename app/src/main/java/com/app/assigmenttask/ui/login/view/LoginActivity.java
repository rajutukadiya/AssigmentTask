package com.app.assigmenttask.ui.login.view;

import static org.koin.java.KoinJavaComponent.inject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.app.assigmenttask.R;
import com.app.assigmenttask.databinding.ActivityLoginBinding;
import com.app.assigmenttask.ui.login.viewmodel.LoginViewModel;

import kotlin.Lazy;


public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding mViewDataBinding;
    private final Lazy<LoginViewModel> loginViewModel = inject(LoginViewModel.class);

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        mViewDataBinding.setLifecycleOwner(this);
        mViewDataBinding.setViewModel(loginViewModel.getValue());

        loginViewModel.getValue().notifyClick.observe(this, id -> {

            switch (id) {
                case R.id.btnLogin: {
                    loginViewModel.getValue().checkLogin(LoginActivity.this);
                }
                case R.id.btnRegister: {

                    Intent intent = new Intent(LoginActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        });


    }

}