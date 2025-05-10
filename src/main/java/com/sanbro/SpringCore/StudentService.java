package com.sanbro.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}
