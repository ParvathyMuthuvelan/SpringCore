package com.beans;

public class Book {
private String bookName;
private String bookPrice;
private int edition;
public Book() {}
public Book(String bookName, String bookPrice, int edition) {
	this.bookName = bookName;
	this.bookPrice = bookPrice;
	this.edition = edition;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookPrice() {
	return bookPrice;
}
public void setBookPrice(String bookPrice) {
	this.bookPrice = bookPrice;
}
public int getEdition() {
	return edition;
}
public void setEdition(int edition) {
	this.edition = edition;
}
@Override
public String toString() {
	return String.format("Book [bookName=%s, bookPrice=%s, edition=%s]", bookName, bookPrice, edition);
}



}
