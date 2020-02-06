package com.gk.IntPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gk1SortingEmpoyee {

	public static void main(String[] args) {
		
		List<Employee> allEmployees = loadEmployees();
		System.out.println(allEmployees);

		System.out.println("After Sorting");

		// Java 7 Approach
		Collections.sort(allEmployees, new EmployeeComparator());
		System.out.println(allEmployees);

		// Java 8 Approach
		System.out.println("Java 8 Approach");
		Collections.sort(allEmployees, Comparator.comparing(Employee::getName)
													.thenComparing(Employee::getCity)
													.thenComparing(Employee::getAge));
		
		System.out.println(allEmployees);
		
		// Below are for Reference
		System.out.println("**********************");
		Comparator<Employee> test = Comparator.comparing(Employee::getName);
		Comparator<Employee> testUsingLambda = Comparator.comparing((Employee emp) -> emp.getName()).thenComparing(emp -> emp.getCity());
		Collections.sort(allEmployees,testUsingLambda);
		System.out.println(allEmployees);

	}

	private static List<Employee> loadEmployees() {
		List<Employee> allEmployees = new ArrayList<Employee>();

		allEmployees.add(new Employee("XXX", "Bangalore", 17));
		allEmployees.add(new Employee("YYY", "Hyd", 18));
		allEmployees.add(new Employee("XXX", "Bangalore", 16));
		allEmployees.add(new Employee("YYY", "Chennai", 30));
		allEmployees.add(new Employee("YYY", "Chennai", 15));

		return allEmployees;
	}

}

// Java 7 Approach
class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		int index = 0;

		index = o1.getName().compareTo(o2.getName());

		if (index == 0) {
			index = o1.getCity().compareTo(o2.getCity());
		}

		if (index == 0) {
			index = o1.getAge().compareTo(o2.getAge());
		}

		return index;
	}

}
