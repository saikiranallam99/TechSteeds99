package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Book;
import com.app.model.Librarian;
import com.app.service.ILibraryService;


@Controller
public class LibraryController 
{
	@Autowired
	private ILibraryService service;

	@RequestMapping("/showLibrary")
	public String showLibraryPage(){
		return "Library";
	}
	
	
	@RequestMapping("/showLibrarian")
	public String showAddLibrarianPage(){
		
		
		return "AddLibrarian";
	}
	
	
	
	@RequestMapping(value="/insertLibrarian",method=RequestMethod.POST)
	public String saveLibrarian(@RequestParam("librarianName")String librarianName,
			@RequestParam("librarianEmail")String librarianEmail,
			@RequestParam("librarianGender")String librarianGender,
			@RequestParam("librarianDateOfBirth")String librarianDateOfBirth,
			@RequestParam("librarianAddress")String librarianAddress,
			@RequestParam("librarianPhone")String librarianPhone,
			@RequestParam("librarianPhoto")CommonsMultipartFile cmf ,
			ModelMap map
			)
	{
		if(cmf!=null){
			
			Librarian librarian=new Librarian();
			librarian.setLibrarianName(librarianName);
			librarian.setLibrarianEmail(librarianEmail);
			librarian.setLibrarianGender(librarianGender);
			librarian.setLibrarianDateOfBirth(librarianDateOfBirth);
			librarian.setLibrarianAddress(librarianAddress);
			librarian.setLibrarianPhone(librarianPhone);
			librarian.setLibrarianPhotoName(cmf.getOriginalFilename());
			librarian.setLibrarianPhoto(cmf.getBytes());
			service.addLibrarian(librarian);
			String message="Librarian saved with name:"+librarian.getLibrarianName();
			map.addAttribute("msg",message);
			
		}
		
		return "AddLibrarian";
	}
	
	
	//Book
	@RequestMapping("/showAddBook")
	public String showAddBookPage(){
		return "AddBook";
	}
	
	@RequestMapping("/showAllBooks")
	public String showAllBooks(ModelMap map){
		List<Book> books=service.getAllBooks();
		map.addAttribute("books",books );
		return "ShowAllBooks";
	}
	
	
	@RequestMapping(value="/insertBook",method=RequestMethod.POST)
	public String saveBook(@ModelAttribute("book")Book book,ModelMap map){
		int bookId=service.addBook(book);
		Book book1=service.getAddBookById(bookId);
		String message="Book saved with Title:"+book1.getBookTitle() ;
		map.addAttribute("msg",message);
		return "AddBook";
	}

	@RequestMapping("/deleteBook")
	public String deleteBook(@RequestParam("bookId")int bookId){
		service.deleteBook(bookId);
		return "redirect:showAllBooks";
	}
	
	@RequestMapping("/showBookDataEdit")
	public String showBookDataEdit(@RequestParam("bookId")int bookId,ModelMap map){
		Book book=service.getAddBookById(bookId);
		map.addAttribute("book",book);
		return "BookDataEdit";
	}
	@RequestMapping(value="/editBook",method=RequestMethod.POST)
	public String editBook(@ModelAttribute("book")Book book){
		service.updateBook(book);;
		return "redirect:showAllBooks";
	}

}
