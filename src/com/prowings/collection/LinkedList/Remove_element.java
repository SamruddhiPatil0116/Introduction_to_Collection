package com.prowings.collection.LinkedList;

import java.util.LinkedList;

public class Remove_element {
	
	public static void main(String[] args) {
		
		LinkedList list1 = new LinkedList();
		
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Banana");
		list1.add("Mango");
		list1.add("12456");
		
		System.out.println("List :"+list1);
		
		list1.remove("Apple");
		System.out.println("Remove Apple :"+list1);
		
		list1.remove(3);
		System.out.println("Remove Index 3 :"+list1);
		
		list1.removeFirst();
		list1.removeLast();
		System.out.println("Remove First and Last element :"+list1);
		
		

		  
		
		
		
		
	}

}
