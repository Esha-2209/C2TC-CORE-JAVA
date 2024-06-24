package com.DaySeven;

public abstract class Shape {
	float area;
	String nameShape;
	public abstract void calculateArea();
	
	public void display() {
		System.out.println("Area of "+nameShape+" is:" +area);
	}
    
	
	
		
		
	
	

}

