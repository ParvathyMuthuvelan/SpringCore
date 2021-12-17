package com.beans;

public class HelloWorld {
	private String message;
	HelloWorld()
	{
		System.out.println("Helloworld Bean initialized");
	}
	public HelloWorld(String message)
	{
		this.message=message;
	}
	void display()
	{
		System.out.println("Welcome to Spring");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
