package com.prowings.collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collection;


public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String ,Integer> map = new HashMap<>();
		System.out.println(map.put("Samruddhi", 2345));
		System.out.println(map.put("Sarvesh", 29865));
		System.out.println(map.put("Viraj", 78654));
		System.out.println(map.put("Varun", 5675));
		System.out.println(map.put("Sejal", 786594));
		System.out.println(map.put("Rutuja", 859483));
		
		System.out.println(map);
		
		System.out.println("----------keyset start-------------");
		Set allKeys =  map.keySet();

		Iterator<String> itr = allKeys.iterator();

		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("----------keyset  end-------------");
		

		System.out.println("----------entrySet start-------------");
		  
		
		Set<Entry<String,Integer>> allEntries =  map.entrySet();

		for(Entry<String, Integer> e : allEntries)
		{
			System.out.println("Key : "+e.getKey() + " and "+"Value : "+e.getValue());
		}
		System.out.println("----------entrySet  end-------------");
		
		
		System.out.println("----------Values  start-------------");

		Collection<Integer> allValues = map.values();

		for(Integer i : allValues)
		{
			System.out.println(i);
		}

		System.out.println("----------Values  end-------------");
		
		System.out.println("Contains Key :"+map.containsKey("Sejal"));
		System.out.println("Contains Value :"+map.containsValue(89765));

		System.out.println(map.get("Samruddhi"));
		
		int size = map.size();
		System.out.println("Size of the map :" +size);
		
		boolean isEmpty = map.isEmpty();
        System.out.println("Is map empty? " + isEmpty);
	}
}
