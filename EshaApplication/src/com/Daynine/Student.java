package com.Daynine;

public class Student {
	
	String name;
	int  id ;
	String language;
	double fees;
	public Student(String name, int id, String language, double fees) {
		super();
		this.name = name;
		this.id = id;
		this.language = language;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", language=" + language + ", fees=" + fees + "]";
	}
	
	
	
	
	
	
	

}
