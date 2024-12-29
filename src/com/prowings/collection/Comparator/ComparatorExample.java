package com.prowings.collection.Comparator;

import java.util.TreeMap;

public class ComparatorExample {
	
	public static void main(String[] args) {
		
		Car c1 = new Car(2010 , "Mahindra" ,580);
		Car c2 = new Car(2019 , "Tesla" , 490);
		Car c3 = new Car(2015 , "Tata" , 790);
		Car c4 = new Car (2016 , "Audi" , 900);
		
		CarComanyNameComparator sortbyname = new CarComanyNameComparator();
		CarSpeedComparator sortbyspeed = new CarSpeedComparator();
		CarmfyearComparator sortbyyear = new CarmfyearComparator();
		
		TreeMap map = new TreeMap<>(sortbyyear );
		
		map.put(c4, 500000000);
		map.put(c3, 500000000);
		map.put(c1, 500000000);
		map.put(c2, 500000000);
		System.out.println(map);
		
	}
	
	

}
