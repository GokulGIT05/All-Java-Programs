package com.java7.gk2.immutable;

public final class StudentImmutable {

	private String name;
	
	private Age ageReference;
	
	public StudentImmutable(String name, Age ageReference) {
		super();
		this.name = name;
		
		Age cloneObj = new Age();
		cloneObj.setAgeDetail(ageReference.getAgeDetail());
		this.ageReference = cloneObj;
	}

	public String getName() {
		return name;
	}

	public Age getAgeReference() {
		
		Age cloneObj1 = new Age();
		cloneObj1.setAgeDetail(this.ageReference.getAgeDetail());
		return cloneObj1;
	}
	
	
}
