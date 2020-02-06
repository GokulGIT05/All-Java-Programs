package com.gk.IntPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Map {
	
	public static void main(String[] args) {

		List<Employee> allEmployees = loadEmployees();
		Map<String,List<Employee>>  mapVal = allEmployees.stream().collect(Collectors.groupingBy(Employee::getName));
		System.out.println(mapVal);
		
		mapVal.forEach((key,value) -> System.out.println("The Key: "+key+" :: Value is: "+value));		
		
		System.out.println();
		
		Map<String,Employee>  mapValWithUniqueKey2 = allEmployees.stream().collect(Collectors.toMap(Employee::getName, Function.identity(), (oldValue,newValue) -> newValue));
		mapValWithUniqueKey2.forEach((key,value) -> System.out.println("The Key: "+key+" :: Value is: "+value));	
		System.out.println();
		
		List<Employee> allEmployeesWithUnqiueKey = loadEmployeesWithUnique();
		Map<String,Employee>  mapValWithUniqueKey = allEmployeesWithUnqiueKey.stream().collect(Collectors.toMap(Employee::getName, Function.identity()));
		mapValWithUniqueKey.forEach((key,value) -> System.out.println("The Key: "+key+" :: Value is: "+value));	
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
	

	private static List<Employee> loadEmployeesWithUnique() {
		List<Employee> allEmployees = new ArrayList<Employee>();

		allEmployees.add(new Employee("XXX", "Bangalore", 17));
		allEmployees.add(new Employee("YYY", "Hyd", 18));
		allEmployees.add(new Employee("XXX2", "Bangalore", 16));
		allEmployees.add(new Employee("YYY2", "Chennai", 30));
		allEmployees.add(new Employee("YYY3", "Chennai", 15));

		return allEmployees;
	}

}
