package com.app.assigmenttask.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.app.assigmenttask.db.dao.UsersDao;
import com.app.assigmenttask.db.model.User;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public UsersDao  usersDao;
}
