package com.junit.bookapp;


import org.springframework.test.context.TestConstructor;

public class Main {

	BookDaoImpl dao;
	Book book;

	public Main() {
		dao = new BookDaoImpl();
	}

	public void testBookDaoImpl() {

	}

	public void testGetAllBooks() {
		int noOfRec = ((Object) dao.listBooks).size();
		assertEquals(4, noOfRec);
	}

	public void testAddBook() {
		Book book = new Book(10, "Maven", "nancy", 3456);
		dao.addBook(book);
		int noOfRec = dao.listBooks.size();
		assertEquals(5, noOfRec);
	}

	
	public void testAddBookFalse() {
		Book book = new Book(10, "Maven","nancy", 3456);
		int noOfRec = dao.listBooks.size();
		assertNotEquals(dao.listBooks.get(noOfRec - 1), dao.listBooks.add(book));
	}

	
	public void testUpdateBook() {

		book = dao.listBooks.get(0);
		assertEquals(book, dao.updateBook("ikigai", "123456"));

	}

	
	public void testDelBook() {

		dao.deleteBook("123456");
		int noOfRec = dao.listBooks.size();
		assertEquals(3, noOfRec);

	}

	
	public void testDelBookFalse() {
		dao.deleteBook("12356");
		int noOfRec = dao.listBooks.size();
		System.out.println(noOfRec);
		assertNotEquals(3, noOfRec);
	}

}
