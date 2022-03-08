package com.techelevator;

public class Book {

    private String bookTitle;
    private String author;
    private double priceOfBook;
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPriceOfBook() {
        return priceOfBook;
    }

    public void setPriceOfBook(double priceOfBook) {
        this.priceOfBook = priceOfBook;
    }

    public Book(String bookTitle, String author, double priceOfBook) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.priceOfBook = priceOfBook;
    }

    public String bookInfo() {
        return "Title: " + bookTitle + ", Author: " + author + ", Price: $" + priceOfBook;
    }
}