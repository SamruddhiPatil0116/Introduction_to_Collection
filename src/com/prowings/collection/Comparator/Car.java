package com.prowings.collection.Comparator;

public class Car {

	private int mgfyear;
	private String carName;
	private int speed;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int mgfyear, String carName, int speed) {
		super();
		this.mgfyear = mgfyear;
		this.carName = carName;
		this.speed = speed;
	}
	public int getMgfyear() {
		return mgfyear;
	}
	public void setMgfyear(int mgfyear) {
		this.mgfyear = mgfyear;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [mgfyear=" + mgfyear + ", carName=" + carName + ", speed=" + speed + "]";
	}
	
	
	


	
	
	
}
