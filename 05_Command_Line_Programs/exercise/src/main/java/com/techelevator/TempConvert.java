package com.techelevator;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		double inCelsius = 0;
		double inFahrenheit = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the temperature: ");
		double userTemp = input.nextDouble();

		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String userMeasurement = input.next();

		if(userMeasurement.equalsIgnoreCase("C")){
			inFahrenheit = userTemp * 1.8 + 32;
			System.out.println(userTemp + "C is " + inFahrenheit + "F");
		}
		if(userMeasurement.equalsIgnoreCase("F")){
			inCelsius = (userTemp - 32) / 1.8;
			System.out.println(userTemp + "F is " + inCelsius + "C");
		}




	}

}
