package com.app.assigmenttask.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.app.assigmenttask.db.model.User;

@Dao
public interface UsersDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void add(User users);

    @Query("Select * from users where email==:emailOrPhone or number == password and password==password")
    User findUser(String emailOrPhone, String password);


}
