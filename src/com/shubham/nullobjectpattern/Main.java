package com.shubham.nullobjectpattern;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle = FactoryVehicle.getVehicleObject("BIKE");
		printVehicleDetails(vehicle);
	}

	private static void printVehicleDetails(Vehicle vehicle) {
		System.out.println("Seating capacity : "+vehicle.getSeatingCapacity());
		System.out.println("Fuel capacity : " + vehicle.getTankCapacity());
	}

}
