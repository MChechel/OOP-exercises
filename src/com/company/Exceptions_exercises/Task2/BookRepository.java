package com.company.Exceptions_exercises.Task2;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class BookRepository {
    Set<Book> booksList = new HashSet<>();

    public BookRepository(Set<Book> booksList) {
        this.booksList = booksList;
    }

    public void addBook(Book theBook){
        booksList.add(theBook);
    }
    public void removeAllBooks(){
        booksList.removeAll(booksList);
    }
    public void removeTheBookById(String id) throws FindException {

        for (Book a:this.booksList){
            if(a.getId().equals(id)){
                this.booksList.remove(a);
            }else{
                throw new FindException("Unfortunately the book with id " + id+ " could not be found");
            }
        }

    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "booksList=" + booksList +
                '}';
    }
}
