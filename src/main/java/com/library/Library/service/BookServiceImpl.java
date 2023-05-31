package com.library.Library.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.library.Library.model.Book;
import com.library.Library.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public void saveBook(Book book) {
		this.bookRepository.save(book);
		
	}


	
	@Override
	public Book getBookById(long id) {
		Optional<Book> optional = bookRepository.findById(id);
		Book book = null;
		if(optional.isPresent()) {
			book = optional.get();
			
		}else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return book;
	}

	@Override
	public void deleteBookById(long id) {
		this.bookRepository.deleteById(id);
		
	}

	
}
