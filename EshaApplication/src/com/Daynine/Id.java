package com.Daynine;

import java.util.Comparator;

public class Id implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student other) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.id, other.id);
	}

}
