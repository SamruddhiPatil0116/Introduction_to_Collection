package com.prowings.collection.LinkedList;

import java.util.LinkedList;

public class Retriving_element {

	public static void main(String[] args) {
		LinkedList<String> Cars = new LinkedList<>();
		
		Cars.add("Swift");
		Cars.add("Creta");
		Cars.add("Thar");
		Cars.add("I 20");
		Cars.add("KIA");
		
		System.out.println("Cars:"+Cars);
		
		String CarAtIndex2 = Cars.get(2);
		System.out.println("Index 2:"+CarAtIndex2);
		
		String CarFrist = Cars.getFirst();
		System.out.println("First Car:"+CarFrist);
		
		String CarLast = Cars.getLast();
		System.out.println("Last Car:"+CarLast);
		
		//System.out.println("cars1:"+Cars);
	}
	
}
