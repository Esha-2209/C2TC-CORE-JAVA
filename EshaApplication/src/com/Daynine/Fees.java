package com.Daynine;

import java.util.Comparator;

public class Fees implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student other) {
		// TODO Auto-generated method stub
		return Double.compare(o1.fees, other.fees);
	}
	

}
