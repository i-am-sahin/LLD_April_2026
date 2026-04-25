package lld1_april_2026.class_basics.lab_book;
/*
Problem Statement
You're building a library management system. Start by modeling a Book entity.

Requirements:

A book has a title, author, ISBN (unique identifier), price, and number of pages

A book can be borrowed and returned
We should be able to check if a book is currently available

*/
public class Book {
    String title;
    String author;
    String ISBN;
    double price;
    int noOfPages;
    boolean isAvailable;
    void Borrow(){
        if(isAvailable){
            isAvailable = false;
            System.out.println(title + " has been borrowed!");
        }else {
            System.out.println(title + " is not available!");
        }
    }
    void returnBook(){
        isAvailable = true;
        System.out.println(title + " has been returned!");
    }
    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: Rs." + price);
        System.out.println("Pages: " + noOfPages);
        System.out.println("Available: " + isAvailable);
    }

}

