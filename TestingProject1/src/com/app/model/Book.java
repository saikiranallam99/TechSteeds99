package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	@Id
	@GeneratedValue
	int bookId;
	String bookTitle ;
	String bookNumber;
	int bookISBNNumber ;
	String publisher;
	String author ;
	String subject;
	int rackNumber;
	int qty;
	int bookPrice;
	String postDate;
	String bookDescription;
	public Book() {
		super();
	}
	public Book(int bookId) {
		super();
		this.bookId = bookId;
	}
	public Book(int bookId, String bookTitle, String bookNumber,
			int bookISBNNumber, String publisher, String author,
			String subject, int rackNumber, int qty, int bookPrice,
			String postDate, String bookDescription) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookNumber = bookNumber;
		this.bookISBNNumber = bookISBNNumber;
		this.publisher = publisher;
		this.author = author;
		this.subject = subject;
		this.rackNumber = rackNumber;
		this.qty = qty;
		this.bookPrice = bookPrice;
		this.postDate = postDate;
		this.bookDescription = bookDescription;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}
	public int getBookISBNNumber() {
		return bookISBNNumber;
	}
	public void setBookISBNNumber(int bookISBNNumber) {
		this.bookISBNNumber = bookISBNNumber;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getRackNumber() {
		return rackNumber;
	}
	public void setRackNumber(int rackNumber) {
		this.rackNumber = rackNumber;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle
				+ ", bookNumber=" + bookNumber + ", bookISBNNumber="
				+ bookISBNNumber + ", publisher=" + publisher + ", author="
				+ author + ", subject=" + subject + ", rackNumber="
				+ rackNumber + ", qty=" + qty + ", bookPrice=" + bookPrice
				+ ", postDate=" + postDate + ", bookDescription="
				+ bookDescription + "]";
	}
	
	
}
