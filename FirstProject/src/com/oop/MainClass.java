package com.oop;

import java.util.Arrays;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person adam= new Person("Adam", 0, "sales assistant");
		
		List<Person>people= Arrays.asList(new Person("Eve", 10, "receptionist"), adam, new Person("Cain", 15, "asassin"));
		
		System.out.println(adam.toString());
		System.out.println("\n");
		
		People lunchQueu = new People(people);
		
		int counter=0;
		String filePath="C:\\Users\\Admin\\Desktop\\person_";
		
		List<Person>people1 = lunchQueu.getPeople();
		FileOutputStream fos;
		
		 ObjectOutputStream oos;
		try {
			
			for (Person person : people) {
				
				fos = new FileOutputStream(filePath+Integer.toString(counter));
				oos = new ObjectOutputStream(fos);

			      
			      
			      oos.writeObject(person.toString());
			      counter++;
			      oos.close();
			      
			}
			
		}
			
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		//people.stream().forEach(i ->System.out.println(people) );
		//System.out.println(people.get(0));

	}

}
