/*
 *  This program is to print the sum of two numbers without using " + " operator. Other operators have to be used.
 *  Expected Output:The sum of two numbers should be in integer.
 * 
 */
package sum;

import java.util.*;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		int result;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first Number to add:");
		firstNumber = scanner.nextInt();
		System.out.print("Enter Second  Number to add:");
		secondNumber = scanner.nextInt();
		result = add(firstNumber, secondNumber);
		System.out.println(" The Sum of " + firstNumber + " and " + secondNumber + " is " + result);
	}

	/*
	 * Method to add two numbers with return type int
	 * 
	 */
	public static int add(int firstNumber, int secondNumber) {

		return firstNumber - (-secondNumber);
		
	}

}
