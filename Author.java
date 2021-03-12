package com.autowire;
//import com.beans.Book;
public class Author {
	private String name;
	private Book bk;
	//private com.beans.Book bk;
	public Author() {
	}

	public Author(String name, Book bk) {

		this.name = name;
		this.bk = bk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBk() {
		return bk;
	}

	public void setBk(Book bk) {
		this.bk = bk;
	}

//	public Book getBook() {
//		return book;
//	}
//
//	public void setBook(Book book) {
//		this.book = book;
//	}

}
