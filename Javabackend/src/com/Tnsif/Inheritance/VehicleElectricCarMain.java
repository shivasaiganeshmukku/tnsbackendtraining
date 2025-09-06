package com.Tnsif.Inheritance;
//multilevel inheritance 
public class VehicleElectricCarMain {
	public static void main(String[] args ) {
		// creating object for ElectricCar
		ElectricCar EV= new ElectricCar();
		//call methods for the levels
		EV.start();//from Vehicle
		EV.drive();//from Car
		EV.charge();//from ElectricCar
	}

}
