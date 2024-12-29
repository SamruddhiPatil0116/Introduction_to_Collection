package com.prowings.collection.Map;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap map = new TreeMap<>();
		
		
		String s1 = "AAA";
        StringBuffer ssb1 = new StringBuffer("BBB");
        StringBuilder ssb2 = new StringBuilder("CCC");
        
        map.put(ssb1, 123);
        map.put(s1,234);
        map.put(ssb2,789);
        
        System.out.println(map);
        
      
	}

}
