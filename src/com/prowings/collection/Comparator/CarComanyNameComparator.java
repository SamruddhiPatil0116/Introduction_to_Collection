package com.prowings.collection.Comparator;

import java.util.Comparator;

public  class CarComanyNameComparator implements Comparator<Car> {
	
	public int compare(Car c1, Car c2) {
	
	 return c1.getCarName().compareTo(c2.getCarName());
	
	}
}

