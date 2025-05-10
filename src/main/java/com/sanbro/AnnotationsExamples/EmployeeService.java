package com.sanbro.AnnotationsExamples;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public String getEmployeeDetails(){
        return "Lets say we have to perform some business logic here";
    }

    @PostConstruct
    public void executesAfterBeanCreation(){
        System.out.println("Been is created successfully");
    }

    @PreDestroy
    public void executeBeforeBeanRemoval(){
        System.out.println("Some important resources closing before bean removal form IOC container");
    }
}
