package com.shubham.nullobjectpattern;

public class FactoryVehicle {
	
	public static Vehicle getVehicleObject(String vehicle) {
		if("CAR".equals(vehicle)) {
			return new Car();
		}
		return new NullVehicle();
	}
}
