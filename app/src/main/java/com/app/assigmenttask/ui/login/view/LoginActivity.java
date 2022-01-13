package com.app.assigmenttask.ui.login.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.app.assigmenttask.R;
import com.app.assigmenttask.databinding.ActivityLoginBinding;
import com.app.assigmenttask.ui.login.viewmodel.LoginViewModel;

import static org.koin.java.KoinJavaComponent.inject;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding mViewDataBinding;
    private LoginViewModel loginViewModel = (LoginViewModel) inject(LoginViewModel.class);

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        mViewDataBinding.setLifecycleOwner(this);
        mViewDataBinding.setViewModel(loginViewModel);

        loginViewModel.notifyClick.observe(this, id -> {

            switch (id) {
                case R.id.btnLogin: {
                    loginViewModel.checkLogin(LoginActivity.this);
                }
                case R.id.btnRegister: {

                    Intent intent = new Intent(LoginActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        });


    }

}