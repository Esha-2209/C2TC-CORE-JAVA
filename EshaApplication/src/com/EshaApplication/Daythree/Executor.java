package com.EshaApplication.Daythree;

public class Executor {
	
	public static void main(String[] args) {
		Address address = new Address("Lower Parel", "Kurla", "Mumbai",86, 400013);
		
		Persons p = new Persons("Esha Pal",address);
//		System.out.println("Persons"+ p);
		display(address,p);
		
		
		
	}
	public static void display(Address address, Persons p) {
		System.out.println("Name: " + p.getName());
		System.out.println("Address:-");
		System.out.println("Street: "+address.getStreet());
		System.out.println("Landmark: " + address.getLandmark());
		System.out.println("City: " + address.getCity());
		System.out.println("Pincode: " + address.getPincode());
	}

}
