package com.DaySeven;

public class Circle extends Shape  {
	static float pi= 3.14f;
	float r;
	String name = "Circle";

	

	public Circle(float r) {
		super();
		this.r = r;
	}



	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		super.area = pi* r * r;
		super.nameShape=name;
		
	}
	
	
	

}
 
