package com.Daynine;

import java.util.Comparator;

public class Language implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student other) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(other.name);
	}

}
