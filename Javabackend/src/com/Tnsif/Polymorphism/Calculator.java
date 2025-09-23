package com.Tnsif.Polymorphism;
// demo for the overloading
public class Calculator {
	
	int mul(int a , int b) {
		return a * b ;
	};
	int mul(int a , int b, int c) {
		return (a * b * c);
	};
	int mul(double x,double y) {
		return (int) (x*y);
	}
	
}