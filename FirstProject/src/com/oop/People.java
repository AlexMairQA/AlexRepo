package com.oop;

import java.util.List;

public class People {
	
	private List<Person>queu;
	
	public People() {
		super();
		
	}

	public People(List<Person> queu) {
		super();
		this.queu = queu;
	}
	
	public List getPeople() {
		
		return queu;
	}

}
