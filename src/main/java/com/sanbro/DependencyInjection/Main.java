package com.sanbro.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        var car = context.getBean(CarService.class);
        var person = context.getBean(Person.class);
        System.out.println(car.getMusicInfo());
        System.out.println(car.getTyreManufactureInfo());
        System.out.println(person);
    }
}
