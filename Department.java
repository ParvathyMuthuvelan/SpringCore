package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class Department {
	private String departmentName;
	private String manager;
	public Department() {}
	public Department(String departmentName, String manager) {
		super();
		this.departmentName = departmentName;
		this.manager = manager;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return String.format("Department [departmentName=%s, manager=%s]", departmentName, manager);
	}
	

}
