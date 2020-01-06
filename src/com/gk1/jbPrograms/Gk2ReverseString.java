package com.gk1.jbPrograms;

public class Gk2ReverseString {

	public static void main(String[] args) {
		
		String toRev = "0123456789";
		
		// Using First Option
		System.out.println("reverseAStringUsingAPI: " + reverseAStringUsingAPI(toRev));
		
		// Using Second Option
		System.out.println("reverseAStringWithoutAPI: "+ reverseAStringWithoutAPI(toRev));

	}

	private static String reverseAStringWithoutAPI(String toRev) {
		
		StringBuilder strbldr = new StringBuilder();
		
		for(int i = toRev.length() - 1 ; i >= 0 ; i--) {
			strbldr.append(toRev.charAt(i));
		}
		
		return strbldr.toString();
	}

	private static String reverseAStringUsingAPI(String toRev) {
		
		StringBuilder strBuilder = new StringBuilder(toRev);
		
		return strBuilder.reverse().toString();
	}

}
