package com.Tnsif.Interface;
//class bike for interface of vehicle 
public class Bike implements Vehicle {
	@Override
	public void start() {
		System.out.println("The bike engine starts with self or kick.");
	}
	@Override
	public void stop() {
		System.out.println("The bike engine stops");
	}
	
}
