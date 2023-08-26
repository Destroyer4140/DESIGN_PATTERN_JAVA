package com.shubham.factory;

public class MarutiCarFactory {
	
	
	public Car getCar(CarType carType) {
		
		switch (carType) {
		case SEDAN:
			return new Ciaz();
		case SUV:
			return new Brezza();
		case HATCHBACK:
			return new WagonR();
		}
	 return null;
	}
}
