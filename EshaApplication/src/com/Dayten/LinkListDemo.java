package com.Dayten;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {
	public static void main(String[] args) {
		
		LinkedList esha = new LinkedList();
//		 
//		for(int i=0; i<5; i++) {
//			esha.add(i);
//			
//		}
//		System.out.println(esha);
//		
//		for(int i=0; i<esha.size(); i++) {
//			System.out.println(esha.get(i));
//			
//			
//			}
//		Object[] arr = esha.toArray();
//		System.out.println(arr);
//		
//		
		

//		for(int i =0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		esha.add(23);
		esha.add("Esha");
		esha.add(23);   //allow duplicate value
		esha.add("Pal");
		System.out.println(esha);
		
		
		LinkedList<String> esha1 = new LinkedList<String>();
		esha1.add("JAVA");
		esha1.add("C");
		esha1.add("C++");
		esha1.add("PYTHON");
		System.out.println(esha1);
		System.out.println(esha1.size());
		
		LinkedList<Integer> esha2 = new LinkedList<Integer>();
		esha2.add(10);
		esha2.add(20);
		esha2.add(30);
		esha2.add(40);
		System.out.println(esha2); //10,20,30,40
		esha2.add(2, 100);
		System.out.println(esha2); //10,20,100,30,40
		
		LinkedList<Integer> esha3 = new LinkedList<Integer>();
		esha3.addFirst(11);
		esha3.addFirst(22);
		esha3.addFirst(33);
		System.out.println(esha3); 
	    esha.addAll(3, esha3);
	    System.out.println(esha);
	    
	    LinkedList<Integer> esha4 = new LinkedList<Integer>();
		esha4.addFirst(11);
		esha4.addFirst(22);
		esha4.addFirst(33);
		System.out.println(esha4); 
	    esha2.addAll(3, esha4);
	    System.out.println(esha2);
	    
	    LinkedList<String> list = new LinkedList<String>();
	    list.add("JAVA");
	    list.add("C");
	    list.add("C++");
	    list.add("APPS");
	    list.add("PYTHON");
	    System.out.println(list);
	    list.remove(3); //apps remove
	    list.removeLast(); //python remove
	    System.out.println(list); // java,c++,c
	    list.removeFirst();//c,c++
	    System.out.println(list);
	    
	    //to iterate the elements 
	    //descendingIterator - tail to head
	    Iterator<String> it = list.descendingIterator();
	    
	    while(it.hasNext()) { //true
	    	System.out.println(it.next()); //returns the next elements of the iterator
	    }
	    
	    
	    Iterator<String> it1 = list.iterator();
	    
	     while(it1.hasNext()) { //true
	    	System.out.println(it1.next()); //returns the next elements of the iterator
	    }
	    
	    
	    
		
		
		
		
		
		
	
		
		
		
	}

}
