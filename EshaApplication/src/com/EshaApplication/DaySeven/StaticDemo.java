package com.EshaApplication.DaySeven;

public class StaticDemo {
	public static int pincode; 
	String address;
	
	static
	{
		System.out.println("I am a static block.");
		pincode = 400013;
	}

	public StaticDemo(String address) { //create constructor
		super();
		this.address = address;
	}

	public StaticDemo() {
		super();
		// TODO Auto-generated constructor stub
		address = "lower parel."; // create constructor
	}

	@Override
	public String toString() {
		return "StaticDemo [address= " + address +  ", pincode- " +pincode +"]";
	}
	
	
	
	
	
	
	

}
 
