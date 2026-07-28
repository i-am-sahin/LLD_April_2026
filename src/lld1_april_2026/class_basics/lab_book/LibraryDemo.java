package lld1_april_2026.class_basics.lab_book;

public class LibraryDemo {
    static void main() {
        Book book = new Book("Clean Code", "Robert C. Martin", "97-45582g5sdg", 599.99, 464, true);



        Book book1 = new Book("The Pragmatic Programmer", "Devid Thomas", "97-4558256554", 800.0, 350, true);


        // If I have to create 100 books, It will require 700 lines of code.


        book.displayInfo();
        book.Borrow();

        book.returnBook();
        book.Borrow();
        book.Borrow();

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        book.setPrice(499.0);


    }
}
