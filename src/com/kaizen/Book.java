package com.kaizen;

import javax.swing.JFrame;

public class Book extends JFrame{
	
	
	public Book() { 
		setSize(600,500);
		setVisible(true);
	}
	String title;
	String isbn;
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	String author;
}


