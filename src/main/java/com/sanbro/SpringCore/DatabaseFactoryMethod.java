package com.sanbro.SpringCore;

public class DatabaseFactoryMethod implements Database{
    private final Database database;
    public DatabaseFactoryMethod(Database database){
        this.database = database;
    }

    @Override
    public String getEmployeeDetails(){
        return database.getEmployeeDetails();
    }
}
