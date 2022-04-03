package com.techelevator;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;

public class WordSearch {

    public static void main(String[] args) throws FileNotFoundException {

        int count = 1;

        Scanner sc = new Scanner(System.in); // Scanner to read user input
        System.out.println("What is the file path to be searched"); // prompt the user
        String path = sc.nextLine(); // assign user input to the variable path
        System.out.println("What word are you looking for?");
        String wordToFind = sc.nextLine(); // assign user input to the variable
        System.out.println("Should the search be case sensitive? (Y/N)"); // prompt user for case sensitivity
        String caseSensitive = String.valueOf(sc.next().charAt(0)); //
        File dataFile = new File(path);
        Scanner fileInput = new Scanner(dataFile);

        if(caseSensitive.equalsIgnoreCase("Y")){
            while(fileInput.hasNextLine()) {
                String line = fileInput.nextLine();

                if(line.contains(wordToFind)){
                    System.out.println(count + ") " + line);
                }
                count++;
            }
        }
        if(caseSensitive.equalsIgnoreCase("N")){
            while(fileInput.hasNextLine()) {
                String line = fileInput.nextLine();

                if(line.toLowerCase(Locale.ROOT).contains(wordToFind)){
                    System.out.println(count + ") " + line);
                }
                count++;
            }
        }




    }

}
