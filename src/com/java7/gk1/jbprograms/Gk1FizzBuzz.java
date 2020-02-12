package com.java7.gk1.jbprograms;

import java.util.Scanner;

public class Gk1FizzBuzz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value: "
				+ "");
		int value = scan.nextInt();

		printFizzBuzz(value);

		scan.close();
	}

	// Problem Statement: Multiples of 3 Print Fizz, Multiples of 5 Print Buzz,
	// Multiples of Both 3 & 5 Print FIZZBUZZ
	private static void printFizzBuzz(int value) {

		for (int i = 1; i <= value; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FIZZBUZZ");
			} else if (i % 5 == 0) {
				System.out.println("BUZZ");
			} else if (i % 3 == 0) {
				System.out.println("FIZZ");
			} else {
				System.out.println(i);
			}
		}

	}

}
