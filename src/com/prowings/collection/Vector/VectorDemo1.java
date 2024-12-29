package com.prowings.collection.Vector;

import java.util.Vector;

public class VectorDemo1 {
	
	public static void main(String[] args) {
		
		Vector vector = new Vector();
		
		vector.add("Orange");
		vector.add("Banana");
		vector.add("Cherry");
		vector.add("Mango");
		vector.add("Time");
		
		System.out.println(vector);
		
		System.out.println("Vector First Element :" + vector.firstElement());
		System.out.println("Vector Last Element :" + vector.lastElement());
		System.out.println("Vector index 2 :" +vector.get(3));
		
		
		vector.remove(2);
		System.out.println("vector is after removing" +vector);
		
		
		System.out.println("Vector size :" + vector.size());
		System.out.println("Vector First capacity :" + vector.capacity());

	}

}
