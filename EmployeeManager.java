package com.spring.aop;

import java.util.List;

public interface EmployeeManager {
	public Employee getEmployeeById(Integer employeeId);

	public List<Employee> getAllEmployee();

	public void createEmployee(Employee employee);

	public void deleteEmployee(Integer employeeId);

	public void updateEmployee(Employee employee);
}
