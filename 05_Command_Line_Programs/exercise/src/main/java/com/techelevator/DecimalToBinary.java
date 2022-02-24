package com.techelevator;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		int asInteger = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a series of decimal values separated by spaces: ");
		String userEnteredNumbers = input.nextLine();
		String[] arrayOfNumbers = userEnteredNumbers.split(" ");
		for(int i = 0; i < arrayOfNumbers.length; i++){
			asInteger = Integer.valueOf(arrayOfNumbers[i]);
			System.out.println(arrayOfNumbers[i] + " in binary is " + Integer.toBinaryString(asInteger));
		}
	}

}
