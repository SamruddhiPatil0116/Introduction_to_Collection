package com.prowings.collection.LinkedList;

import java.util.LinkedList;

public class LinkedListAddElement {
	
	public static void main(String[] args) {
		
		LinkedList fruits = new LinkedList();
		
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Cherry");
		fruits.add("Mango");
		fruits.add(1, "Banana");
		
		fruits.addFirst("XYZ");
		fruits.addLast("fho");
		
		System.out.println("Fruits"+fruits);
	}

}
