package com.techelevator;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        //ask for inputs
        System.out.println("What is the search word?");
        String searchWord = userInput.nextLine();

        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();

        System.out.println("What is the source file?");
        String sourceFilePath = userInput.nextLine();

        System.out.println("What is the destination file?");
        String destinationFilePath = userInput.nextLine();

        //new book file and converted file
        File originalFile = new File(sourceFilePath);
        File convertedFile = new File (destinationFilePath);

        //open the original and converted files

        try (Scanner fileInput = new Scanner(originalFile); var fileOutput = new PrintWriter(convertedFile)) {

            //While there's input from the source file
            while(fileInput.hasNextLine()){
                //make a string for the current line of text
                String lineOfText = fileInput.nextLine();

                //output
                fileOutput.println(lineOfText.replace(searchWord, replacementWord));

            }

            //if there is a file error, do this
        } catch (FileNotFoundException e) {
            // Could not find the file at the specified path.
            System.out.println("The file was not found: " + originalFile.getAbsolutePath());
        }

    }

}
