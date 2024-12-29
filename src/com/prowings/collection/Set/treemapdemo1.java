package com.prowings.collection.Set;

import java.util.TreeSet;

public class treemapdemo1 {
	
	public static void main(String[] args) {
		
		Student S1 = new Student(10, "Ram" , "More");

		Student S2 = new Student(18, "Aman" , "Naik");

	

		Student S4 = new Student(1, "Harsh" , "Bhosale");
		
		
		TreeSet<Student> ts = new TreeSet<>();
		
	
		System.out.println(ts.add(S2));
		System.out.println(ts.add(S4));
		System.out.println(ts.add(S1));
		
		System.out.println(ts);
		
	}

}
