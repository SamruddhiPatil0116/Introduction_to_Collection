package com.prowings.collection.LinkedList;

import java.util.LinkedList;

public class ListSize {

	public static void main(String[] args) {
		
		LinkedList Names = new LinkedList();
		
		Names.add("Samruddhi");
		Names.add("Suman");
		Names.add("Viraj");
		Names.add("Varun");
		Names.add("Sarvesh");
		
		System.out.println("Names :"+Names);
		
		boolean containsMango = Names.contains("Mango");
		System.out.println("ContainsMango:"+containsMango);
		
		int size  = Names.size();
		System.out.println("Size :" +size);
		
		
		Names.clear();
        System.out.println("Names after clear: " + Names);
        
        boolean isempty = Names.isEmpty();
        System.out.println("Names is Empty :"+isempty);
	}
}
