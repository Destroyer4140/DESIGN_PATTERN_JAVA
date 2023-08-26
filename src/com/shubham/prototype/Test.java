package com.shubham.prototype;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Car> carList = new ArrayList<>();
		WagnoR wagnoR = new WagnoR();
		wagnoR.setModelYear(2023);
		
		Brezza brezza = new Brezza();
		brezza.setModelYear(2021);
		
		carList.add(wagnoR);
		carList.add(brezza);
		
		for(Car car : carList) {
			System.out.println(car.getClass().getName()+ " "+car.toString()+" "+"CarEngine "+car.getEngineCC()+" "+"CarPrice "+car.getPrice());
			
		}
		
		List<Car> copyCarList = new ArrayList<>();
		for(Car car : carList) {
			copyCarList.add(car.getCarInstance(car));
		}
		
		for(Car car : copyCarList) {
			System.out.println(car.getClass().getName()+ " "+car.toString()+" "+"CarEngine "+car.getEngineCC()+" "+"CarPrice "+car.getPrice());
			
		}
	}

}
