package com.sanbro.SpringCore;

public class Main {
    public static void main(String[] args) {
        MySQLImpl mysql = new MySQLImpl();
        Database mysqlDatabase = new DatabaseFactoryMethod(mysql);
        System.out.println(mysqlDatabase.getEmployeeDetails());

        OracleImpl oracle = new OracleImpl();
        Database oracleDatabase = new DatabaseFactoryMethod(oracle);
        System.out.println(oracleDatabase.getEmployeeDetails());

        /* can add any other implementations without changing the other code
        just add the implementation of other database for example say PostGres and in main class
         this was loose coupling is achieved */
    }
}
