package com.sanbro.AspectOrientedProgramming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    @Autowired
    private Vehicle vehicle;

    public void setVehicleDetails(){
        System.out.println("executing");
        vehicle.setName("Ferrari");
    }

    public String getVehicleDetails(){
        System.out.println("get executing");
        return vehicle.getName();
    }
}
