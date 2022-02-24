package com.techelevator;
import java.text.DecimalFormat;
import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		double userLength = 0;
		String unitMeasurement = "";

		System.out.print("Please enter the length: ");
		userLength = userInput.nextDouble();

		System.out.print("Is the measurement in (f)eet or (m)eters? ");
		unitMeasurement =  userInput.next();

		if(unitMeasurement.equalsIgnoreCase("f")){
			double meters = userLength * 0.3048;
			System.out.println(meters + "m is " + userLength + "f");
		}

		if(unitMeasurement.equalsIgnoreCase("m")){
			double feet = userLength * 3.2808399;
			System.out.println(feet + "f is " + userLength+ "m");


		}

	}

}
