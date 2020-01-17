package com.gk1.jbPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gk3ConverionOfListToArray {

	public static void main(String[] args) {

		List<String> listStr = Arrays.asList("1", "2");
		System.out.println(listStr);

		/*
		 * listStr.add("3"); // java.lang.UnsupportedOperationException
		 * System.out.println(listStr);
		 */
		
		List<String> listToArray = new ArrayList<String>();
		listToArray.add("ONE");
		listToArray.add("TWO");
		System.out.println(listToArray);
		
		// List to Array : Easiest Way
	//	Object[] strArray1 =  listToArray.toArray();
		
		String[] strArray1 =  listToArray.toArray(new String[listToArray.size()]);
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		// Below is the Only way to convert Integer Collection Object to int Primitive.
		
		int[] primitiveArray = new int[intList.size()];
		
		for(int i = 0 ; i < intList.size(); i++) {
			primitiveArray[i] =  intList.get(i);
			System.out.println("CONVERSION");
		}
		
		for(int i : primitiveArray) {
			System.out.println(i);
		}
		System.out.println("******************");
		
		Integer[] easyConversion = intList.toArray(new Integer[intList.size()]);
		for(int i : easyConversion) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(easyConversion));
		System.out.println(listStr);
		
		
	}

} 	
