package com.sanbro.xmlconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansDefinitions.xml");
        Employee employee = (Employee) context.getBean("employee");

        System.out.println(employee);
    }
}
