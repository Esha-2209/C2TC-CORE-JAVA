package com.EshaApplication.Day7;

public class FinalDemo {
	public static void main(String[] args) {
		final float pi = 3.14f;
		System.out.println(pi);
		Child obj = new Child();
		obj.marry();
		obj.property();
	}

}
 
 class Parent{
	 void property() {
		System.out.println("bunglow");
		
	}
	void marry() {
		System.out.println("Esha");
	}
	
	
}

class Child extends Parent{
	    void marry() {
		System.out.println("Payal");
	}
	
}
