package com.app.assigmenttask.ui.register.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.app.assigmenttask.R;
import com.app.assigmenttask.databinding.ActivityRegisterBinding;
import com.app.assigmenttask.ui.login.view.LoginActivity;
import com.app.assigmenttask.ui.register.viewmodel.RegisterViewModel;

public class RegisterActivity extends AppCompatActivity {

    private RegisterViewModel registerViewModel;
    private ActivityRegisterBinding mViewDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_register);
        mViewDataBinding.setLifecycleOwner(this);
        mViewDataBinding.setViewModel(registerViewModel);

        registerViewModel.successRegister.observe(this, id -> {
            registerViewModel.showMessage(this,R.string.successfully_registered);

        });


    }
}