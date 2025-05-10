package com.sanbro.AnnotationConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext
                (com.sanbro.AnnotationConfiguration.Config.class);
        Employee employee = (Employee) context.getBean("getEmployee");
        System.out.println(employee);
    }
}
