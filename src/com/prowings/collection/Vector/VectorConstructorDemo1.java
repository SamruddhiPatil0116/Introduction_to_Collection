package com.prowings.collection.Vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorConstructorDemo1 {
	
	public static void main(String[] args) {
		// Creating a Vector with initial capacity of 15 and capacity increment of 5
		Vector<String> vector3 = new Vector<>(10, 5);
		
		vector3.add("Samruddhi");
		vector3.add("Varun");
		vector3.add("Viraj");
		vector3.add("Viraj");
		vector3.add("Viraj");
		vector3.add("Viraj");
		vector3.add("Viraj");
		vector3.add("Viraj");
		vector3.add("Viraj");
		vector3.add("Viraj");
		//vector3.add("Viraj");
		
		System.out.println("Vector3: "+vector3);
		System.out.println("Initial Capacity :"+vector3.capacity());
		
		
		// Creating a Vector with initial capacity of 20
        Vector<Integer> vector2 = new Vector<>(20);

        vector2.add(1);
        vector2.add(2);

        System.out.println("Vector2: " + vector2);
        System.out.println("Capacity of Vector2: " + vector2.capacity()); 
        
        
        ArrayList list1 = new ArrayList();
        
        list1.add("Samruddhi");
        list1.add("Varun");
        list1.add("Viraj");
        list1.add("Sarvesh");
        
        System.out.println(list1);
        
        Vector<String> vector = new Vector<>(list1);
        
       System.out.println("Vector :" +vector);
        
	}

}
