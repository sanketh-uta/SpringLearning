package com.sanbro.AnnotationConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Employee getEmployee(){
        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("sanketh");
        return employee;
    }
}
