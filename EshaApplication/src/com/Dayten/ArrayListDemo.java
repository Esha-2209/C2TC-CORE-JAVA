package com.Dayten;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		//method 1
		ArrayList<Integer> obj1 = new ArrayList<Integer>(3);
		ArrayList obj = new ArrayList();
		
		
		//method 2 
		List esha = new ArrayList();
		System.out.println(obj.size());
		
		obj.add("esha");
		obj.add(2);
		System.out.println(obj);
		
		obj.add(1, "Pal");
		System.out.println(obj);
		
		esha.add(3);
		
		
		esha.addAll(0,obj);
		System.out.println(esha);
		
		esha.forEach(System.out::println);
		
	
		
		
		
		
	
		
	}
	
	
	
	
	

}
