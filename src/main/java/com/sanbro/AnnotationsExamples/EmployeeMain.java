package com.sanbro.AnnotationsExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class EmployeeMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.sanbro.AnnotationsExamples");
        EmployeeHelperClass employeeHelperClass = context.getBean(EmployeeHelperClass.class);
        System.out.println(employeeHelperClass.getEmployeeDetails());
    }
}
