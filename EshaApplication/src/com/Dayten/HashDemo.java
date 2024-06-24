package com.Dayten;

import java.util.ArrayList;
import java.util.HashSet;

public class HashDemo {
	public static void main(String[] args) {
		HashSet<ArrayList> esha = new HashSet<ArrayList>();
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		list1.add(1);
		list1.add(2);
		list1.add("esha");
		
		list2.add(1);
		list2.add("esha");
		list2.add(2);
//		list2.add("esha");
		
		esha.add(list1);
		esha.add(list2);
		
		System.out.println(esha.size());
		
		
		HashSet<String> esha1 = new HashSet<>();
		 
		esha1.add("India");
	    esha1.add("Australia");
	    esha1.add("South Africa");

	        // Adding duplicate elements
	    esha1.add("India");

	        // Displaying the HashSet
	        System.out.println(esha1);
		
		
		
		
		
	}

}
