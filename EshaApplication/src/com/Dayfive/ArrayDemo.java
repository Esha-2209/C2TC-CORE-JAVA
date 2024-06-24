package com.Dayfive;

public class ArrayDemo {
	public static void main(String[] args) {
		//declaring arrays with its size
//		int[] arr = new int[3];
//		double[] arr = new double[3];
//		String[] arr = new String[3];
  
		//declaring and adding values at a same time
		int arr1[]= {1,2,3,4};
		
		byte[][] arr = new byte[2][3];
		System.out.println(arr);// Address of arr[0]
		System.out.println(arr[0]);// Address of arr[0][0]
		System.out.println(arr[0][0]);// Value of arr[0][0]
	}

}
