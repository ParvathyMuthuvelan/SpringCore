package com.interfaces;

public class Rectangle implements Shape{
private double length;
private double breadth;

public double getLength() {
	return length;
}

public void setLength(double length) {
	this.length = length;
}

public double getBreadth() {
	return breadth;
}

public void setBreadth(double breadth) {
	this.breadth = breadth;
}

public double calculateArea() {
	// TODO Auto-generated method stub
	System.out.print("Area of rectangle=");
	return length*breadth;
}
}
