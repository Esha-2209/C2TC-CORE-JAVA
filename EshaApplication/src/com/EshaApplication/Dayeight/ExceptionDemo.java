package com.EshaApplication.Dayeight;

public class ExceptionDemo {
	public static void main(String[] args) {
		int arr[]= {2,4,6,8,5,6};
		
		try {
			System.out.println(arr[7]); //error can come
		}
		catch(RuntimeException e){ //e is object of exception 
			System.out.println(e.getMessage());
			System.err.println(e.getMessage());
			
		}
		finally {
			System.out.println("I will execute"); 
		}
	}

}
