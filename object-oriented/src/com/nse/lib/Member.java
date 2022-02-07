package com.nse.lib;

public class Member {
	private String name;
	private Book book;
	
	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void status() {
		if(book != null)
			System.out.println(name + " has issued " + book.getTitle());
		else
			System.out.println(name + " had not taken any book");
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
