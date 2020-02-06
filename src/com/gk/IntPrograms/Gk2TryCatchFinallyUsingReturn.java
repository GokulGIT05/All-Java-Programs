package com.gk.IntPrograms;

public class Gk2TryCatchFinallyUsingReturn {

	public static void main(String[] args) {
		
		
		System.out.println(test());

	}

	private static int test() {
		
		try {
			System.out.println("Inside TRY");
			return 10;
		}catch (Exception e) {
			return 20;
		}finally {
			return 30;
		}
		
	}

}
