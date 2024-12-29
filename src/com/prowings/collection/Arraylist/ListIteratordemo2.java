package com.prowings.collection.Arraylist;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.ListIterator;

	public class ListIteratordemo2 {
	    public static void main(String[] args) {
	        List<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");

	        ListIterator<String> iterator = fruits.listIterator();

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	 
	        while (iterator.hasPrevious()) {
	            System.out.println(iterator.previous());
	        }

	      
	        iterator = fruits.listIterator();
	        iterator.next(); 
	        iterator.add("Orange");

	       
	        System.out.println(fruits);
	    }
	}


