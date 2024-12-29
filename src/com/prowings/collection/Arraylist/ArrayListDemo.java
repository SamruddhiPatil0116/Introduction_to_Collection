package com.prowings.collection.Arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList  mylist = new ArrayList();
		
		mylist.add("xxx");

		mylist.add(1111);
		mylist.add("AAA");
		mylist.add("BBB");
		mylist.add(2222);
		mylist.add("nnnnn");
		mylist.add(33333);
		mylist.add(5555);
		System.out.println(mylist);
		
		System.out.println(mylist.size());
		
		
		mylist.add("AAA");
		mylist.add("BBB");
		int x = 123;
		mylist.add(x);
		mylist.add(123.45f);
		mylist.add(true);
		mylist.add('a');
		
		mylist.addAll(mylist);
		System.out.println(mylist);
		
	}

}
