package com.Tnsif.Abstract;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee ftm = new FullTimeEmployee();
		Employee ptm = new PartTimeEmployee();
		
		ftm.calculatesalary();
		ptm.calculatesalary();
	}

}
