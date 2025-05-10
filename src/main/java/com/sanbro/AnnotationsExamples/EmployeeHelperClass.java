package com.sanbro.AnnotationsExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeHelperClass {
    @Autowired
    private EmployeeService employeeService;
    public String getEmployeeDetails(){
        return employeeService.getEmployeeDetails();
    }
}
