package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILibraryDao;
import com.app.model.Book;
import com.app.model.Librarian;
import com.app.service.ILibraryService;
@Service
public class LibraryServiceImpl implements ILibraryService 
{
	@Autowired
	private ILibraryDao dao;
	public int addLibrarian(Librarian librarian) {
	
		return dao.addLibrarian(librarian);
	}
	public Librarian getLibrarianById(int librarianId) {
		
		return dao.getLibrarianById(librarianId);
	}
	public List<Librarian> getAllLibrarians() {
	
		return dao.getAllLibrarians();
	}
	public void updateLibrarian(Librarian librarian) {
		
		dao.updateLibrarian(librarian);
	}
	public void deleteLibrarian(int librarianId) {
	    dao.deleteLibrarian(librarianId);
		
	}
	public int addBook(Book book) {
		
		return dao.addBook(book);
	}
	public Book getAddBookById(int bookId) {
	
		return dao.getAddBookById(bookId);
	}
	public List<Book> getAllBooks() {
		
		return dao.getAllBooks();
	}
	public void updateBook(Book book) {
		dao.updateBook(book);
		
	}
	public void deleteBook(int bookId) {
		
		dao.deleteBook(bookId);
	
	}

}
