package com.shubham.prototype;

public abstract class Car implements Clone, VehicleInterface {

	private int modelYear;

	public Car() {
		super();
	}

	public Car(Car car) {
		this.modelYear = car.modelYear;
	}
	
	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	@Override
	public String toString() {
		return "Car [modelYear=" + modelYear + "]";
	}
	
	
}
