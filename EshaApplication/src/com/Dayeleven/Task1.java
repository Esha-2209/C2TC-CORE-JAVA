package com.Dayeleven;

import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<Integer> esha = new ArrayList<Integer>();

		esha.add(10);
		esha.add(20);
		esha.add(30);
		esha.add(40);
		esha.add(50);
		System.out.println(esha); 

		for (int i = 0; i < esha.size() ; i++) {
			System.out.println(esha.get(i)* esha.get(i));
			
		}
	}

}
