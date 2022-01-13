package com.app.assigmenttask.ui.register.viewmodel;

import android.content.Context;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.app.assigmenttask.R;
import com.app.assigmenttask.db.model.User;
import com.app.assigmenttask.repository.UserRepository;

import java.util.regex.Pattern;

public class RegisterViewModel extends ViewModel {

    public UserRepository userRepository;
    public String strName = "";
    public String strEmail = "";
    public String strPhone = "";
    public String strPassword = "";
    public MutableLiveData<Boolean> successRegister = new MutableLiveData();

    public RegisterViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private Boolean isValid(Context context) {
        if (strName.isEmpty()) {
            showMessage(context, R.string.valid_name);
            return false;
        } else if (strEmail.isEmpty()) {
            showMessage(context, R.string.empty_email);
            return false;
        } else if (!Pattern.matches(Patterns.EMAIL_ADDRESS.toString(), strEmail)) {
            showMessage(context, R.string.valid_email);
            return false;
        } else if (strPhone.isEmpty()) {
            showMessage(context, R.string.empty_phone);
            return false;
        } else if (strPassword.isEmpty()) {
            showMessage(context, R.string.empty_password);
            return false;
        }
        return true;
    }

   public void onClick(View view) {
        if (isValid(view.getContext())) {


            User user = new User();
            user.setName(strName);
            user.setNumber(strPhone);
            user.setEmail(strEmail);
            user.setPassword(strPassword);

            userRepository.addUser(user);
            successRegister.postValue(true);

        }
    }


    public void showMessage(Context context, int msg) {
        Toast.makeText(context, context.getString(msg), Toast.LENGTH_SHORT).show();
    }
}
