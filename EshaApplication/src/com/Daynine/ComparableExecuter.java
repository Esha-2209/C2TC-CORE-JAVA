package com.Daynine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExecuter {
	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5,6};
//		System.out.println(arr[1]);
//		
//		for (int i = 0; i < arr.length; i++) { 
//			System.out.print(arr[i]+ " ");
//			
//		}
//			
//		ArrayList obj = new ArrayList();
//		obj.add("Esha");
//		obj.add(5);
//		obj.add(44);
//		System.out.println(obj);
		
		List<Employee> emp = new ArrayList<Employee>(); 
		emp.add(new Employee("Esha",21,500000d));
		emp.add(new Employee("Soham",21,200000d));
		emp.add(new Employee("Payal",19,300000d));
		emp.add(new Employee("Amit",22,400000d));
		
	    emp.forEach(System.out::println); //printing
	    System.out.println();
	    
	    Collections.sort(emp);        // use for sorting elements
	    emp.forEach(System.out:: println); 
	    
	    
	    
	    
	    
		
		
		
	}

}

