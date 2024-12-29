package com.prowings.collection.Map;

import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Linked {

	public static void main(String[] args) {
		
		System.out.println("Main Method is Starded");
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		System.out.println(map.put("Samruddhi", 3838));
		System.out.println(map.put("Sejal", 9879));
		System.out.println(map.put("Sarvesh", 9087));
		System.out.println(map.put("Varun", 90786));
		
		System.out.println(map);
		
		System.out.println("-----------Keys-----------");
		
		Set<String> allkeys = map.keySet();
		
		for(String key : allkeys)
		{
			System.out.println(key);
		}
		
		System.out.println("-----------Values----------");
		Collection<Integer> allValues = map.values();
		
		for(Integer values : allValues)
		{
			System.out.println(values);
		}
		
		System.out.println("---------Entries---------");
		Set<Entry<String,Integer>> allentries = map.entrySet();
		
		for(Entry<String,Integer> entry : allentries)
		{
			System.out.println(entry);
		}
	}
}
