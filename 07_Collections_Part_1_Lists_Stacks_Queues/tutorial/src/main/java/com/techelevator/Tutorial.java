package com.techelevator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Tutorial {
	
    public static void main(String[] args) {

    	// Step One: Declare a List
        List<String> newList = new ArrayList<String>();

    	
    	// Step Two: Add values to a List
        newList.add("Ada");
        newList.add("Grace");
        newList.add("Margaret");
        newList.add("Adele");
        System.out.println(newList);

    	
    	// Step Three: Looping through a List in a for loop
        for(int i = 0; i < newList.size(); i++){
            System.out.println("The name at index " + i + " is " + newList.get(i));
        }

    	
    	// Step Four: Remove an item
        newList.remove("Ada");
        System.out.println(newList);

    	
    	// Step Five: Looping through List in a for-each loop
        for(String name : newList){
            System.out.println("Name: " + name);
        }

    }

}
