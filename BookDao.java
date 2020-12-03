package com.junit.bookapp;

import java.util.*;
public interface BookDao {
	List<Book> getAllBooks();
	Book updateBook( int id,int page );
	Book deleteBook( int id );
    void addBook(Book book );

}
