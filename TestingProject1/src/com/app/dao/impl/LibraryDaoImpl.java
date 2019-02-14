package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ILibraryDao;
import com.app.model.Book;
import com.app.model.Librarian;
@Repository
public class LibraryDaoImpl implements ILibraryDao {
	@Autowired
	private HibernateTemplate ht;
	
	public int addLibrarian(Librarian librarian) {
		int librarianId=(Integer) ht.save(librarian);
		return librarianId;	
	}
	public Librarian getLibrarianById(int librarianId) {
		Librarian librarian=ht.get(Librarian.class, librarianId);
		return librarian;
	}
	public List<Librarian> getAllLibrarians() {
	
		return ht.loadAll(Librarian.class);
	}
	public void updateLibrarian(Librarian librarian) {
		ht.update(librarian);
		
	}
	public void deleteLibrarian(int librarianId) {
	
		ht.delete(new Librarian(librarianId));
	}
	
	public int addBook(Book book) {
		
		int bookId=(Integer) ht.save(book);
		return bookId;	
	}
	public Book getAddBookById(int bookId) {
		
		Book book=ht.get(Book.class, bookId);
		return book;
	}
	public List<Book> getAllBooks() {
	
		return ht.loadAll(Book.class);
	}
	public void updateBook(Book book) {
		
		ht.update(book);
	}
	public void deleteBook(int bookId) {
	
		ht.delete(new Book(bookId));
	}

}
