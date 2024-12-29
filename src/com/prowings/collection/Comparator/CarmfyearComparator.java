package com.prowings.collection.Comparator;

import java.util.Comparator;

public  class CarmfyearComparator implements Comparator<Car> {
	
	public int compare(Car c1, Car c2) {
	
	 if(c1.getMgfyear() == c2.getMgfyear())
	 {
		 return 0;
		 
	 }
	 else if (c1.getMgfyear() > c2.getMgfyear())
		 return 1;
	 else
		 return -9;
	 
	
	}
}

