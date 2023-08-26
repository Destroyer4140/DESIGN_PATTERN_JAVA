package com.shubham.prototype;

public class WagnoR extends Car {
	
	

	public WagnoR() {
		super();
		System.out.println("WagnoR car object is created using default constructor.");
	}

	public WagnoR(Car car) {
		super(car);
		System.out.println("WagnoR car object is created using copy constructor.");
	}

	@Override
	public Car getCarInstance(Car car) {
		return new WagnoR(car);
	}

	@Override
	public int getEngineCC() {
		return 900;
	}

	@Override
	public int getPrice() {
		return 900000;
	}

}
