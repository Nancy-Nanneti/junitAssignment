package com.junit.bookapp;

public class Book {

	 private int id;
	    private String name;
	    private String author;
	    private int NoOfpages;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getNoOfpages() {
			return NoOfpages;
		}
		public void setNoOfpages(int noOfpages) {
			NoOfpages = noOfpages;
		}
		public Book(int id, String name, String author, int noOfpages) {
			
			this.id = id;
			this.name = name;
			this.author = author;
			NoOfpages = noOfpages;
		}
		public Book() {
			super();
			
		}
		@Override
		public String toString() {
			return "JunitAssignmentBook [id=" + id + ", name=" + name + ", author=" + author
					+ ", NoOfpages=" + NoOfpages + "]";
		}
	   
}
