package com.library.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.Library.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
