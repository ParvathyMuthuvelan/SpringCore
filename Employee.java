package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	private int id;
	private String name;
	//@Autowired
	private Department department;
	public Employee() {}
	@Autowired
	public Employee(int id,String name,Department department) {
		
		this.id=id;
		this.name=name;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Department getDepartment() {
		return department;
	}
	//@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, department=%s]", id, name, department);
	}
	
	

}
