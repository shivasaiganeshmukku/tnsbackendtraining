package com.Tnsif.Interface;
//vehicle interface for main 
public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car=new Car();
		Vehicle bike=new Bike();
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();

	}

}
