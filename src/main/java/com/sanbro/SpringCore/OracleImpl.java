package com.sanbro.SpringCore;

public class OracleImpl implements Database{

    @Override
    public String getEmployeeDetails() {
        return "returning employee details from the Oracle database";
    }
}
