package com.gk.IntPrograms;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Gk3FindMaxValueUsingJava8 {
	
	public static void main(String[] args) {
		// https://mkyong.com/java8/java-how-to-convert-array-to-stream/
		
		int[] arrayval = {20,15,2,1};
		
		IntStream streamValInt = Arrays.stream(arrayval); 
		streamValInt.forEach(e -> System.out.println(e));
		
		Stream<int[]> stream1 = Stream.of(arrayval);
		stream1.forEach(e -> System.out.println(e));
		
		System.out.println(stream1);
		System.out.println("*******************************");
		
		// creating a stream 
        IntStream stream = IntStream.of(arrayval); // Recommended to Use
  
        // OptionalInt is a container object 
        // which may or may not contain a 
        // int value. 
        OptionalInt obj = stream.max(); 
  
        // If a value is present, isPresent() will 
        // return true and getAsInt() will 
        // return the value 
        if (obj.isPresent()) { 
            System.out.println(obj.getAsInt()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
        
        System.out.println("*******************************");

		OptionalInt val = streamValInt.max();
		
		if(val.isPresent()) {
			System.out.println(val.getAsInt());
		}else {
			System.out.println(-1);
		}
		
		
		
	}

}
