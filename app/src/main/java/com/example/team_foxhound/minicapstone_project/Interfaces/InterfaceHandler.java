package com.example.team_foxhound.minicapstone_project.Interfaces;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Nitesh on 07-Nov-15.
 */
public interface InterfaceHandler {
    public void putUserInfo(int age, int weight, int height,String username,int HBMAX, SQLiteDatabase db);
}
