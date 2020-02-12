package com.java7.gk2.immutable;

public class GkImmutableMainApp {

	public static void main(String[] args) {

		Age ageObj = new Age();
		ageObj.setAgeDetail(26);
		StudentImmutable immutableObj = new StudentImmutable("Gokul", ageObj);
		
		System.out.println(immutableObj.getName() + "  :: "+ immutableObj.getAgeReference().getAgeDetail());
		
		immutableObj.getAgeReference().setAgeDetail(100);
		immutableObj.getAgeReference().setAgeDetail(1000);
		
		System.out.println(immutableObj.getName() + "  :: "+ immutableObj.getAgeReference().getAgeDetail());
		
	}

}
