/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Statements {

	/**
	 * method@param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num = s.nextInt(); //read input
		if (num >= 0) { 
			System.out.println("The given number is positive");
		}
		else { 
			System.out.println("The given number is negative");
		}
		
	}

}
