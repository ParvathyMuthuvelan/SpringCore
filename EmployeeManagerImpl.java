package com.spring.aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
 
@Component
public class EmployeeManagerImpl implements EmployeeManager 
{
    public Employee getEmployeeById(Integer employeeId) {
        System.out.println("Method getEmployeeById() called");
        return new Employee();
    }
 
    public List<Employee> getAllEmployee() {
        System.out.println("Method getAllEmployee() called");
        return new ArrayList<Employee>();
    }
 
    public void createEmployee(Employee employee) {
        System.out.println("Method createEmployee() called");
    }
 
    public void deleteEmployee(Integer employeeId) {
        System.out.println("Method deleteEmployee() called");
    }
 
    public void updateEmployee(Employee employee) {
        System.out.println("Method updateEmployee() called");
    }
}