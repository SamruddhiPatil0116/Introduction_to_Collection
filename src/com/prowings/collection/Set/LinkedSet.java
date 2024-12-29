package com.prowings.collection.Set;
import java.util.LinkedHashSet;

public class LinkedSet {

	public static void main(String[] args) {
		
		System.out.println("Main Method is Starded");
		
		LinkedHashSet<String> ls = new LinkedHashSet<>();
		
		System.out.println(ls.add("Samruddhi" ));
		System.out.println(ls.add("Sejal"));
		System.out.println(ls.add("Sarvesh"));
		System.out.println(ls.add("Varun"));
		
		System.out.println(ls);
		
	}
}