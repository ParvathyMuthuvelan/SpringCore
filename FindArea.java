package com.interfaces;

public class FindArea {
	Shape shape;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
   
	public double displayArea()
	{
		double area=shape.calculateArea();
		return area;
	}
	
}
