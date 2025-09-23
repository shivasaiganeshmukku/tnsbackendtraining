package com.Tnsif.Polymorphism;
//main class for the Vehicle method overriding
public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle c = new Car();
		Vehicle T = new Truck();
		Vehicle EC = new ElectricCar();
		
		c.fuelType();
		T.fuelType();
		EC.fuelType();
	}

}
