package com.techelevator;

/**
 * Bookstore
 */
public class Bookstore {

    public static void main(String[] args) {

        System.out.println("Welcome to the Tech Elevator Bookstore");
        System.out.println();

        // Step Three: Test the getters and setters
        Book twoCities = new Book("A Tale of Two Cities", "Charles Dickens", 15.99);
//        twoCities.setBookTitle("A Tale of Two Cities");
//        twoCities.setAuthor("Charles Dickens");
//        twoCities.setPriceOfBook(14.99);
//        System.out.println("Title: " + twoCities.getBookTitle() + ", Author: " + twoCities.getAuthor() +
//                ", Price: $" + twoCities.getPriceOfBook());
        // Step Five: Test the Book constructor
        Book threeMusketeers = new Book("The Three Musketeers", "Alexandre Dumas", 12.95);

        Book childhoodEnd = new Book("Childhood's End", "Arthur C. Clark", 5.99);

//        System.out.println("Title: " + threeMusketeers.getBookTitle() + ", Author: " + threeMusketeers.getAuthor() +
//                ", Price: $" + threeMusketeers.getPriceOfBook());
//
//        System.out.println("Title: " + childhoodEnd.getBookTitle() + ", Author: " + childhoodEnd.getAuthor() +
//                ", Price: $" + childhoodEnd.getPriceOfBook());
        System.out.println(twoCities.bookInfo());
        System.out.println(threeMusketeers.bookInfo());
        System.out.println(childhoodEnd.bookInfo());

        // Step Nine: Test the ShoppingCart class
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(twoCities);
        shoppingCart.add(threeMusketeers);
        shoppingCart.add(childhoodEnd);
        System.out.println(shoppingCart.receipt());
        
    }
}