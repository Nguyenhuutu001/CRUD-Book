package com.library.Library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.library.Library.model.Book;
import com.library.Library.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("listBooks", bookService.getAllBooks());
		return "books" ;
	}
	@GetMapping("/newbook")
	public String newBook(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "new_book";
	}

	@PostMapping("/savebook")
	public String saveBook(@ModelAttribute("book") Book book) {
		bookService.saveBook(book);
		return "redirect:/books";
	}

	
	@GetMapping("/edit/{id}")
	public String editBook(@PathVariable(value = "id")  long id, Model model) {
		// get book from service
		Book book = bookService.getBookById(id);
		model.addAttribute("book", book);
		return "edit";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteBook(@PathVariable(value = "id") long id) {
		this.bookService.deleteBookById(id);
		return "redirect:/books";
	}
	
	
	

}

