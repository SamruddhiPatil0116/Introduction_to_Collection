package com.prowings.collection.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo1 {

	public static void main(String[] args) {
		
	SortedMap<Integer, String> Map = new TreeMap<> ();
		
		Map.put(2, "Viraj");
		Map.put(4, "Tarun");
		Map.put(1, "Varun");
		Map.put(3, "Saniya");
		
		System.out.println(Map);
		
		System.out.println("First Key :" +Map.firstKey());
		System.out.println("Second Key :" +Map.lastKey());
		
		SortedMap<Integer, String> subMap = Map.subMap(2, 4);
        System.out.println("SubMap from 2 to 4: " + subMap);
	}
}
