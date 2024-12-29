package com.prowings.collection.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList fruits = new ArrayList();
	    
	      fruits.add("Orange");
	      fruits.add("Apple");
	      fruits.add("Banana");
	      
	      System.out.println("List :" +fruits);
	      
	      Iterator<String> iterator = fruits.iterator();
	      
	      while (iterator.hasNext()) {
	            String fruit = iterator.next();
	            System.out.println(fruit); 
	        }
	      
	}

}
