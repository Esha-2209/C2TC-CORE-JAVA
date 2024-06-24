package com.Dayeleven;

public class LamdaExpressionDemo {
	public static void main(String[] args) {
		final double pi = 3.14d; //pi value
//		Message1 obj = new Message1();
//		Shape obj = (side)-> {return side*side;};
		Shape square = (side)-> {return side*side;};
		Shape1 rectangle = (length,breadth)-> {return length * breadth;}; 
		Shape circle =(radius)-> {return (int) pi*radius*radius;};
		
		
		System.out.println(square.calculateArea(11));
		System.out.println(rectangle.calculateArea(11,12));
		System.out.println(circle.calculateArea(97));
		
		
		Message obj = (name)->{
			System.out.println("Good morning " + name);
		};
		obj.greet("eshu");
	}

}
