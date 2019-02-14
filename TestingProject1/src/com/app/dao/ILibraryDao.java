package com.app.dao;

import java.util.List;



import com.app.model.Book;
import com.app.model.Librarian;



public interface ILibraryDao {
	//Librarian
	public int  addLibrarian(Librarian librarian);
	public Librarian  getLibrarianById(int librarianId);
	public List<Librarian> getAllLibrarians();
	public void updateLibrarian(Librarian librarian);
	public void deleteLibrarian(int librarianId);
	
	//BOOK
	public int  addBook(Book book);
	public Book  getAddBookById(int bookId);
	public List<Book> getAllBooks();
	public void updateBook(Book book);
	public void deleteBook(int bookId);
}
