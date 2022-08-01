package com.beans;

import org.springframework.stereotype.Component;

@Component
public class Employ {
	int empId;
	String empName;
	Passport passObj;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Passport getPassObj() {
		return passObj;
	}
	public void setPassObj(Passport passObj) {
		this.passObj = passObj;
	}
	@Override
	public String toString() {
		return String.format("Employ [empId=%s, empName=%s, passObj=%s]", empId, empName, passObj);
	}
	

}
