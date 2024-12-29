package com.prowings.collection.Arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
	
	
	public static void main(String[] args) {
		
		ArrayList mylist = new ArrayList();
		
		
		

		mylist.add("Samruddhi");
		mylist.add("Sejal");
		mylist.add(1111);
		mylist.add("Varun");
		mylist.add("SARVESH");
		mylist.add(3425.09);
		System.out.println(mylist);
		
		ArrayList mylist1 = new ArrayList();
		mylist1.add("Pratiksha Patil");
		mylist1.add("Ram Patil");
		mylist1.add(2222);
		mylist1.add("Suraj");
		mylist1.add("Rohit");
		mylist1.add(3425.978);
		
		mylist1.addAll(mylist);
		System.out.println(mylist1);
		System.out.println("Size of Elements :"+mylist1.size());
		
		
		
		
		
		
	}

}
