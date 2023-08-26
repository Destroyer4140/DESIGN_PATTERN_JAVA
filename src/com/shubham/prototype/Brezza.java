package com.shubham.prototype;

public class Brezza extends Car {
	
	

	public Brezza() {
		super();
		System.out.println("Brezza car instance is created using default constructor.");
	}
	
	public Brezza(Car car) {
		super(car);
		System.out.println("Brezza car instance is created using copy constructor.");
	}



	@Override
	public Car getCarInstance(Car car) {
		return new Brezza(car);
	}

	@Override
	public int getEngineCC() {
		return 1200;
	}

	@Override
	public int getPrice() {
		return 1000000;
	}

}
