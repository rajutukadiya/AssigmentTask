package com.app.assigmenttask.repository;

import com.app.assigmenttask.db.dao.UsersDao;
import com.app.assigmenttask.db.model.User;

public interface UserRepository {
    void addUser(User user);
    User findUser(String emailOrPhone, String password);
}
