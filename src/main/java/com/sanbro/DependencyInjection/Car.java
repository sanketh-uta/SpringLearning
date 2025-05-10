package com.sanbro.DependencyInjection;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String name;
    @PostConstruct
    public void initialize(){
        this.name = "Ferrari";
    }
    private final CarService carService;
    @Autowired
    public Car(CarService carService){
        this.carService = carService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarService getCarService() {
        return carService;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carService=" + carService +
                '}';
    }
}
