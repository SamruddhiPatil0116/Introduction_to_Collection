package com.prowings.collection.Arraylist;

import java.util.ArrayList;

public class Collection_Methods {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("Samu");
		list.add(1234);
		list.add("Samruddhi Patil");
		list.add(1245);
		System.out.println("List :"+list);
		
		
	    System.out.println("List size: " + list.size());
	    
	    
	    System.out.println("HashCode :"+ list.hashCode());
	    // list.clear();
	    //System.out.println("List Clear :" + list);
	    System.out.println("List Empty :" + list.isEmpty());
		
	    ArrayList list2 = new ArrayList();
	    list2.addAll(list);
	    System.out.println("List2 :"+list2);
		
	    list.remove(1);
	    System.out.println("Remove element using index :"+list); 
	    
	    list.remove("Samu");
	    System.out.println("Remove element using Object :"+list);
	    
	    list.containsAll(list2);
	    System.out.println("Contains all element :"+list2);
	    
	    System.out.println("List 2 size: " + list2.size());
	    
	    list.removeAll(list);
	    System.out.println("Remove all elements :"+list); 
	    
	    
	    /*ArrayList<String> list3 = new ArrayList<String>(ArrayList.of("A", "B"));
	    ArrayList<String> list5 = new ArrayList<String>(ArrayList.of("A", "B"));

	    boolean isEqual = list3.equals(list5);
	    System.out.println(isEqual); */

	    
	}
}
