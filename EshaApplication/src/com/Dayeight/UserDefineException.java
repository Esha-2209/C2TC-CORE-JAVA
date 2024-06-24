package com.Dayeight;

import java.io.FileNotFoundException;

public class UserDefineException {
	public static void main(String[] args) throws CantVote {
		int age = 5;
		String name = "Esha";
		
		System.out.println("Enter your name:"+ name);
		if(age <=18){
//			System.out.println("You cant vote.");
			
			throw new CantVote("You cant vote.");
		}
		else {
			System.out.println("You can vote.");
			
		
		}
	
	}

}
class CantVote extends NumberFormatException{

	public CantVote(String name) {
		super(name);
	}
	
      
}
