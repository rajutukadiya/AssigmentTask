package com.app.assigmenttask.repository;

import com.app.assigmenttask.db.dao.UsersDao;
import com.app.assigmenttask.db.model.User;

public class UserRepositoryImpl implements UserRepository {
    private final UsersDao dao;

    public UserRepositoryImpl(UsersDao dao) {
        this.dao = dao;
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public User findUser(String emailOrPhone, String password) {
        return dao.findUser(emailOrPhone, password);
    }
}
