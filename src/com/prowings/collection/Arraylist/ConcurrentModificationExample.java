package com.prowings.collection.Arraylist;
import java.util.ArrayList;
	import java.util.List;

	public class ConcurrentModificationExample {
	    public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("A");
	        list.add("B");
	        list.add("C");

	        // Iterating through the list using for-each
	        for (String s : list) {
	            if (s.equals("B")) {
	                list.remove(s);  // Modifying the list while iterating
	            }
	        }
	    }
	}


