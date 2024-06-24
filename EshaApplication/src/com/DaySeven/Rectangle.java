package com.DaySeven;

public class Rectangle extends Shape {
	float length,breadth;
	String name = "Rectangle";
	

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		super.area= length * breadth;
		super.nameShape= name;
	}
	
	
	

}

