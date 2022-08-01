package com.beans;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean(name = "emp")
	public Employ getEmploy() {
		Employ employ = new Employ();
		employ.setEmpId(10001);
		employ.setEmpName("Sai");
		employ.setPassObj(getPassport());
		return employ;
	}

	@Bean(name = "passport")
	public Passport getPassport() {
		Date d = new Date(2040, 02, 02);
		Passport passport = new Passport();
		passport.setPassNum(12345);
		passport.setDateOfIssue(new Date());
		passport.setDateOfExpiry(d);
		return passport;
	}
}
