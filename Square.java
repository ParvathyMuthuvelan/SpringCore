package com.interfaces;

public class Square implements Shape {
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public double calculateArea() {
		// TODO Auto-generated method stub
		System.out.print("Area of square=");
		return side * side;
	}

}
