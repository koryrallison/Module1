package com.techelevator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		String fileName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the destination file:");
		fileName = sc.nextLine();
		sc.close();

		try {
			PrintWriter w = new PrintWriter(fileName);

			for(int n = 1; n <= 300; n++){
				if(n % 3 == 0 && n % 5 == 0){
					w.println("FizzBuzz");
				}
				else if (n % 3 == 0){
					w.println("Fizz");
				}
				else if (n % 5 == 0){
					w.println("Buzz");
				}
				else
					w.println(n);
			}
			w.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Invalid destination file.");
		}


	}

}
