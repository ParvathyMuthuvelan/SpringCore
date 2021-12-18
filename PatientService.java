package com.service;

import org.springframework.beans.factory.annotation.Autowired;


import com.beans.Patient;

public class PatientService {

	//@Autowired
	
	private Patient patient;

	
	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public void getPatientDetails() {
		System.out.println("Patient Id : "+patient.getPid());
		System.out.println("Patient Name : "+patient.getPname());
		System.out.println("Disease : "+patient.getDisease());
		System.out.println("Gender : "+patient.getGender());
		System.out.println("Admit Status : "+patient.getAdmit_status());
		System.out.println("Age : "+patient.getAge());
	}
	
	
}
