package com.company.Exceptions_exercises.Task2;

import java.util.HashSet;
import java.util.Set;

public class ExceptionsTask2Implementation {
    public static void main(String[] args) {
        Book book1 = new Book("155","Lord","Someone",1850);
        Book book2 = new Book("160","Lord","Someone",1900);
        Book book3 = new Book("abc","Lord","Someone",2000);
        Book book4 = new Book("qqq","Lord","Someone",2021);
        Set<Book> mySet = new HashSet<>();
        mySet.add(book1);
        BookRepository myLibrary = new BookRepository(mySet);

        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        System.out.println(myLibrary);
        myLibrary.removeAllBooks();
        System.out.println(myLibrary);
        myLibrary.addBook(book2);
        myLibrary.addBook(book4);
        myLibrary.removeTheBookById("qqsas");
        System.out.println(myLibrary);
    }
    //

}
