package com.beans;

public class Patient {

	private String pid;

	private String pname;

	private String disease;

	private String gender;

	private String admit_status;

	private int age;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAdmit_status() {
		return admit_status;
	}

	public void setAdmit_status(String admit_status) {
		this.admit_status = admit_status;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Patient [pid=%s, pname=%s, disease=%s, gender=%s, admit_status=%s, age=%s]", pid, pname,
				disease, gender, admit_status, age);
	}

	

}
