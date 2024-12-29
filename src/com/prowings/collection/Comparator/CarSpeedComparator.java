package com.prowings.collection.Comparator;

import java.util.Comparator;

public  class CarSpeedComparator implements Comparator<Car> {
	
	public int compare(Car c1, Car c2) {
	
	 if(c1.getSpeed() == c2.getSpeed())
	 {
		 return 0;
		 
	 }
	 else if (c1.getSpeed() > c2.getSpeed())
		 return 1;
	 else
		 return -9;
	 
	
	}
}

