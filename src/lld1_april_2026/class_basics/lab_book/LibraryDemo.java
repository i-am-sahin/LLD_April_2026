package lld1_april_2026.class_basics.lab_book;

public class LibraryDemo {
    static void main() {
        Book book = new Book();
        book.title = "Clean Code";
        book.author = "Robert C. Martin";
        book.ISBN = "97-45582g5sdg";
        book.price = 599.99;
        book.noOfPages = 464;
        book.isAvailable = true;


        Book book1 = new Book();
        book1.title = "The Pragmatic Programmer";
        book1.author = "Devid Thomas";
        book1.ISBN = "97-4558256554";
        book1.price = 800.0;
        book1.noOfPages = 350;
        book1.isAvailable = true;

        // If I have to create 100 books, It will require 700 lines of code.


        book.displayInfo();
        book.Borrow();

        book.returnBook();
        book.Borrow();
        book.Borrow();

    }
}
