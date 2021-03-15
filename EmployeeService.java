package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService
{
    public Employee getEmployeeById(Integer employeeId) {
        System.out.println("Method getEmployeeById() called");
        return new Employee();
    }
}