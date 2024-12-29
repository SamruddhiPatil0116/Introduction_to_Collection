package com.prowings.collection.Vector;


	
	import java.util.Enumeration;
	import java.util.Vector;

	public class EnumerationExample {
	    public static void main(String[] args) {
	        
	        Vector<String> fruits = new Vector<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");

	      
	        Enumeration<String> fruitEnum = fruits.elements();


	        System.out.println("Fruits in the vector:");
	        while (fruitEnum.hasMoreElements()) {
	            String fruit = fruitEnum.nextElement(); 
	            System.out.println(fruit);
	        }
	    }
	}



