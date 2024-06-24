package com.Dayten;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack esha = new Stack();
		
		for(int i=0; i<=5; i++) { //push- adding elements
			esha.push(i);
		
		}
		System.out.println(esha);
		
		System.out.println("The top element is" + esha.peek()); // peek- taking first element or accessing elements
		
		for(int i=0; i<=5; i++) {
			System.out.println(esha.pop()); // pop - removing element
		}
		
		
		
		
	}

	private void push(int i) {
		// TODO Auto-generated method stub
		
	}

	

}
