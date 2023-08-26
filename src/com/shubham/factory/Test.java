package com.shubham.factory;

public class Test {

	public static void main(String[] args)
	{
		CarType testCar = CarType.SEDAN;
		MarutiCarFactory marutiCarFactory = new MarutiCarFactory();
		Car car = marutiCarFactory.getCar(testCar);
		System.out.println("Car "+car.getClass().getName() + 
				" has " + car.getEngine() + " with price "+car.getPrice());
	}
	
}
