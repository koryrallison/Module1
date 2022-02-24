package com.techelevator;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner fibonacciInput = new Scanner(System.in);


		int firstNumber = 0;
		int secondNumber = 1;
		int thirdNumber = 0;

		System.out.print("Please enter a number: ");
		int userNumber = fibonacciInput.nextInt();

		System.out.print(firstNumber + ", " + secondNumber);

		while(thirdNumber < userNumber){
			thirdNumber = firstNumber + secondNumber;

			if (thirdNumber <= userNumber){
				System.out.print(", " + thirdNumber);
			}
			firstNumber = secondNumber;
			secondNumber = thirdNumber;

		}

	}

}
