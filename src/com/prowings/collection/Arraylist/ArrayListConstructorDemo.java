package com.prowings.collection.Arraylist;

import java.util.ArrayList;

//import javax.print.attribute.SetOfIntegerSyntax;

public class ArrayListConstructorDemo {

	public static void main(String[] args) {
		
		ArrayList List = new ArrayList();
		
		
		// Default Constructor
		
		List.add("samruddhi");
		List.add(1234);
		List.add(654987);
		List.add("Sejal Patil ");
		System.out.println("List :"+List);
		
       // Constructor with initial capacity
		
		ArrayList<Integer> List1 = new ArrayList<>(4);
		
		List1.add(1111);
		List1.add(3333);
		List1.add(null);
		List1.add(8888);
		//List1.add(8888);
		System.out.println("List1:"+List1);
		
		//Constructor using another collection
		
		ArrayList<Integer> List2 = new ArrayList<>(List1);
		
		System.out.println("List2" +List1);
				
		
		//Adding both Integer and String elements
		
		ArrayList<Object> List3 = new ArrayList<>();
		
		List3.addAll(List);
		System.out.println("List3:"+List3);
		
		
		
		
		
		

		
		
		
	}
}
