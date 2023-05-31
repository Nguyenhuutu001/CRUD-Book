package com.library.Library.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.library.Library.model.Book;


public interface BookService {
	List<Book> getAllBooks();
	void saveBook(Book book);
	Book getBookById(long id);
	void deleteBookById(long id);

}
