package com.sanbro.SpringCore;

public class MySQLImpl implements Database {
    @Override
    public String getEmployeeDetails() {
        return "Returning employee details from the MySQL database";
    }
}
