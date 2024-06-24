package com.Dayeleven;

import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Stream obj = Stream.of(10,20,30,40,50);
//		long count = obj.count();
//		System.out.println(count);
		Function<Integer,Integer> square = (n)-> n*n ;
		obj.map(square).forEach(System.out::println);
		
		
		
		
		
	}

}
