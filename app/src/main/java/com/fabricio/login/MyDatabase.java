package com.fabricio.login;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Venda.class}, version =1, exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {

    public abstract DAO vendasDao();

}
