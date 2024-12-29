package com.prowings.collection.Map;

import java.util.TreeMap;

public class Treemapex {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(123,"Samrudhi" , "Kolhapur");
		Student s2 = new Student(234, "Viraj" , "Mumbai");
		Student s3 = new Student(890, "Varun", "Aasam");
		
		TreeMap map = new TreeMap<>();
		
		map.put(s3, 890);
		map.put(s1,807);
		map.put(s2,870);
		
		System.out.println(map);
	}

}
