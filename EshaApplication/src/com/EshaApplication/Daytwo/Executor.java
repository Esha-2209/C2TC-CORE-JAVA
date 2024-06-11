package com.EshaApplication.Daytwo;
import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Customer Id:");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name:");
		String name  = sc.nextLine();
		
		System.out.println("Enter Customer City:");
		String city= sc.nextLine();
		
//		Customer obj1 = new Customer();  //default constructor 
//		
//		obj1.setCustomer_Id(id);
//		obj1.setCustomerName(name);
//		obj1.setCustomerCity(city);
//		
//		System.out.println("Customer Details: " + obj1.toString());
//		
		Customer obj2 = new Customer(id,name,city);
		System.out.println(obj2);
		
		
	}

}
