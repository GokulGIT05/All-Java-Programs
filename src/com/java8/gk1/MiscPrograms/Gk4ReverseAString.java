package com.java8.gk1.MiscPrograms;

public class Gk4ReverseAString {

	public static void main(String[] args) {

		String str = "12345";

		// 1. Using StringBuilder.
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		System.out.println("1. Using StringBuilder " + builder);

		// 2. Without Using API
		StringBuilder strBldr = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) { // Lenghth - 1 is needed. Otherwise ArrayIndexOutOfBound Exception
														// will occurs.
			strBldr.append(str.charAt(i));
		}

		/*
		 * int length = str.length(); while(length > 0) {
		 * strBldr.append(str.charAt(length)); length--; }
		 */

		System.out.println("2. Without Using API: " + strBldr);

		// 3. Optimized Code. Asked in Capegemini Interview.
		String reversedString = reverse(str);
		System.out.println("3. Optimized Code. Asked in Capegemini Interview " + reversedString);

	}

	// Nice Code
	public static String reverse(String orig) {
		char[] s = orig.toCharArray();
		int n = s.length;
		int halfLength = n / 2;
		for (int i = 0; i < halfLength; i++) {
			char temp = s[i];
			s[i] = s[n - 1 - i];
			s[n - 1 - i] = temp;
		}
		return new String(s);
	}

}
