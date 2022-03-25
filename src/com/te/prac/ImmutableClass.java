package com.te.prac;

public class ImmutableClass {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Darshana", "Associate Software Engineer");
		int id = employee1.getId();
		String name = employee1.getName();
		String designation = employee1.getDesignation();
		System.out.println(id + " , " + name + " , " + designation);
	}

}
