package com.prowings.collection.Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map;

public class HashMapDemo2 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> map = new HashMap<>();

        // put(K key, V value) 
        map.put("name", "Viraj");
        map.put("age", "21");
        map.put("city", "Kolhapur");
        System.out.println("Map after putting values: " + map);

        // get(Object key) 
        String name = map.get("name");
        System.out.println("Value of key 'name': " + name);

        // remove(Object key) - Remove the key-value pair by key
         map.remove("age");
         System.out.println("Map after removing key 'age': " + map);

        // containsKey(Object key) - Check if the key exists in the map
          boolean hasNameKey = map.containsKey("name");
          System.out.println("Map contains 'name' key: " + hasNameKey);

        // containsValue(Object value) - Check if the value exists in the map
          boolean hasValue = map.containsValue("Viraj");
          System.out.println("Map contains value 'Viraj': " + hasValue);

        // keySet() - Get all the keys in the map
        Set<String> keys = map.keySet();
        System.out.println("Keys in the map: " + keys);

        // values() - Get all the values in the map
          Collection<String> values = map.values();
          System.out.println("Values in the map: " + values);

        // entrySet() - Get all key-value pairs (entries) in the map
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println("Entries in the map: " + entries);

        // size() - Get the number of key-value pairs in the map
        int size = map.size();
        System.out.println("Size of the map: " + size);

        // isEmpty() - Check if the map is empty
         boolean isEmpty = map.isEmpty();
         System.out.println("Is map empty? " + isEmpty);
    }
}

