package com.Daynine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExecutor {
	public static void main(String[] args) {
		List<Student> stud = new ArrayList<Student>();
		stud.add(new Student("Esha",47,"Java",140000));
		stud.add(new Student("Soham",97,"Java",148000));
		stud.add(new Student("Meet", 88,"Python",240000));
		stud.add(new Student("Payal",99,"C++",140800));
		stud.add(new Student("Amit",101,"Html",240000));
		
		stud.forEach(System.out::println); 
		System.out.println();
		
		System.out.println("Sorting by name");
		
		Collections.sort(stud,new Name());
		stud.forEach(System.out::println);
		
		System.out.println("Sorting by Id");
		
		Collections.sort(stud, new Id());
		stud.forEach(System.out::println);
		
		System.out.println("Sorting by Language");
		
		Collections.sort(stud, new Language());
		stud.forEach(System.out::println);
		
		System.out.println("Sorting by Fees");
		
		Collections.sort(stud, new Fees());
		stud.forEach(System.out::println);
		
		
		
	}
	
	

}
