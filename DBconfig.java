package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBconfig {
	@Value("${db.driver}")
	private String driverName;
	@Value("${db.username}")
	private String userName;

	@Value("${db.password}")
	private String password;

	@Value("${db.url}")
	private String url;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Override
	public String toString() {
		return String.format("DBconfig [driverName=%s, userName=%s, password=%s, url=%s]", driverName, userName,
				password, url);
	}

}