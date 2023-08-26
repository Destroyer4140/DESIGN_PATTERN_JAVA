package com.shubham.builder;

public class Car {

	//mandatory
	private final int engineCC;
	//mandatory
	private final int price;
	//optional
	private final int modelYear;
	
	public int getEngineCC() {
		return engineCC;
	}

	public int getPrice() {
		return price;
	}

	public int getModelYear() {
		return modelYear;
	}

	private Car(CarBuilder carBuilder) {
		this.modelYear = carBuilder.modelYear;
		this.engineCC = carBuilder.engineCC;
		this.price = carBuilder.price;
	}
	
	//Builder Class
	public static class CarBuilder {
		private final int engineCC;
		
		private final int price;
		
		private int modelYear;
		
		public void set(int modelYear) {
			this.modelYear = modelYear;
		}
		
		public CarBuilder(int engineCC,int price) {
			this.engineCC = engineCC;
			this.price = price;
		}
		public Car Build() {
			return new Car(this);
		}
	}
}
