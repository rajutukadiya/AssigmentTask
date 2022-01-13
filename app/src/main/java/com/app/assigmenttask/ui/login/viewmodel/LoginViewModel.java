package com.app.assigmenttask.ui.login.viewmodel;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.app.assigmenttask.R;
import com.app.assigmenttask.db.model.User;
import com.app.assigmenttask.repository.UserRepository;

public class LoginViewModel extends ViewModel {

    public MutableLiveData<Integer> notifyClick = new MutableLiveData();
    public String strEmailOrPhone = "";
    public String strPassword = "";
    public MutableLiveData<Boolean> loginSuccess = new MutableLiveData();
    public UserRepository userRepository;

    LoginViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void onClick(View view) {
        notifyClick.postValue(view.getId());

    }

    public void checkLogin(Context context) {
        if (strEmailOrPhone.isEmpty()) {
            showMessage(context, R.string.empty_email_or_phone);
        } else if (strPassword.isEmpty()) {
            showMessage(context, R.string.empty_password);
        } else {

            if (findUser() != null) {
                loginSuccess.postValue(true);
            } else {
                loginSuccess.postValue(false);
            }

        }
    }

    private User findUser() {
        {
            return userRepository.findUser(strEmailOrPhone, strPassword);
        }
    }

    void showMessage(Context context, int msg) {
        Toast.makeText(context, context.getString(msg), Toast.LENGTH_SHORT).show();
    }


}
