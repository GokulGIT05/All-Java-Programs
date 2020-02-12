package com.java8.gk1.MiscPrograms;

public class Employee {

	private String name;
	private String city;
	private Integer age;

	public Employee(String name, String city, Integer age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", age=" + age + "]";
	}

	

}
