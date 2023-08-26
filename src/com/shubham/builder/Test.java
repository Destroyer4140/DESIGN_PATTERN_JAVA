package com.shubham.builder;

public class Test {
	
	public static void main(String[] args)
	{
		Car.CarBuilder carBuilder2023 = new Car.CarBuilder(1200, 800000);
		carBuilder2023.set(2023);
		Car car = carBuilder2023.Build();
		
		System.out.println(carBuilder2023.getClass().getName() + car.hashCode() +
				" has enginee CC "+car.getEngineCC()+" of price "+car.getPrice() + " with model "+car.getModelYear());
		
		Car.CarBuilder carBuilder2021 = new Car.CarBuilder(1000, 600000);
		Car car2 = carBuilder2021.Build();
		System.out.println(carBuilder2021.getClass().getName() + car2.hashCode() +
				" has enginee CC "+car2.getEngineCC()+" of price "+car2.getPrice()+" with model "+car2.getModelYear());
	}
}
