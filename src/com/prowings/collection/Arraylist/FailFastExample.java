package com.prowings.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class FailFastExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Using an iterator
        for (String item : list) {
            if (item.equals("B")) {
                list.remove(item);  // Modifying the list during iteration
            }
        }
    }
}
