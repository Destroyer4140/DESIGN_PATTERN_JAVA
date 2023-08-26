package com.shubham.abstractfactory;

public class Test {

	public static void main(String[] args) {
		CiazCarFactory ciazCarFactory = new CiazCarFactory();
		Car car = ciazCarFactory.getCar();
		System.out.println("Car "+car.getClass().getName()+" has enginee of cc "+car.getEngine()
		+" with price of "+car.getPrice());
	}

}
