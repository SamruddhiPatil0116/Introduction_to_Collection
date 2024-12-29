package com.prowings.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		 //List<String> list = new ArrayList<>();
		
		list1.add("samrudhi");
		list1.add("Patil");
		list1.add("Ankita");
		list1.add("Sarvesh");
		list1.add("Viraj");
		list1.add("Varun");
		
		System.out.println(list1);
		
		ListIterator<String> iterator = list1.listIterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		System.out.println("<<<<<<<<Previous Order>>>>>>");
		
		 while (iterator.hasPrevious()) 
		 {
	         System.out.println(iterator.previous());
	     }
		 
		 iterator.add("Runali");
		
		 
		 System.out.println("<<<<<<<<After adding the Runali>>>>>>>>>");
		 
		 while(iterator.hasNext())
		 {
			 System.out.println(iterator.next());
		 }
		
		     System.out.println(list1);
	}
}
