package com.oop;

import java.io.Serializable;

public class Person {
	String name;
	int age;
	String jobTitle;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return String.format("Person [name=" + name + ", age= %1$d, jobTitle=" + jobTitle + "]", age);
	}
	
	
		
	

}
