package com.daoCollection;


import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    //list is working as a database
    private List<Books> books;

    public BookDaoImpl() {
        books = new ArrayList<>();
        books.add(new Books(1, "Java"));
        books.add(new Books(2, "Python"));
        books.add(new Books(3, "Android"));
    }

    public List<Books> getAllBooks() {
        return books;
    }

   
    public Books getBookByIsbn(int isbn) {
        return books.get(isbn);
    }

   
    public void saveBook(Books book) {
        books.add(book);
    }

    
    public void deleteBook(Books book) {
        books.remove(book);
    }
}