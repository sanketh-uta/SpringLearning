package com.sanbro.AspectOrientedProgramming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        var vehcile = context.getBean(VehicleService.class);
        vehcile.setVehicleDetails();
        System.out.println(vehcile.getVehicleDetails());
    }
}
