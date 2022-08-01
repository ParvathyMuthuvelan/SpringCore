package com.beans;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Passport {
	int passNum;
	Date dateOfIssue;
	Date dateOfExpiry;
	public int getPassNum() {
		return passNum;
	}
	public void setPassNum(int passNum) {
		this.passNum = passNum;
	}
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	@Override
	public String toString() {
		return String.format("Passport [passNum=%s, dateOfIssue=%s, dateOfExpiry=%s]", passNum, dateOfIssue,
				dateOfExpiry);
	}
	

}
