package com.library.Library.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	@Column(name = "title")
	private String title;
	
	@Column(name = "author")
	private String author;
	
	@Column(name ="description")
	private String description;
	
	@Column(name= "category")
	private String category;
	
	@Column(name= "release_date")
	private String release_date;
	
	@Column(name= "num_page")
	private int num_page;
	
	

	public Book(String title, String author, String category, String release_date, int num_page) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.release_date = release_date;
		this.num_page = num_page;
	}

	public Book() {
		super();
	}

	public Book(long id, String title, String author, String description, String category, String release_date,
			int num_page) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.description = description;
		this.category = category;
		this.release_date = release_date;
		this.num_page = num_page;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public int getNum_page() {
		return num_page;
	}

	public void setNum_page(int num_page) {
		this.num_page = num_page;
	}
	
	
	
	
	
	

}
