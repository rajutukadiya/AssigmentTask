package com.app.assigmenttask.repository;

import com.app.assigmenttask.db.dao.UsersDao;
import com.app.assigmenttask.db.model.User;

public interface UserRepository {
    void addUser(User user);
    User findUser(String emailOrPhone, String password);
}

class UserRepositoryImpl implements UserRepository {
    private UsersDao dao;

    UserRepositoryImpl(UsersDao dao) {
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
