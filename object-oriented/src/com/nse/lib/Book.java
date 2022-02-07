package com.nse.lib;

public class Book {
	private String title;
	private Member mbr;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void status() { 
		if(mbr != null) 
			System.out.println(title + " is issued to " + mbr.getName());
		else
			System.out.println(title + " is not issued to any member");
	}
	
	public void issueBook(Member m) {
		if(mbr == null && m.getBook() == null) {
			mbr = m;
			m.setBook(this);
		} else
			System.out.println(title + " cannot be issued to " + m.getName());
	}
	
	public void returnBook(Member m) {
		if(mbr == null)
			System.out.println(title + " is not issued to " + m.getName());
		else if(m.getBook() == null)
			System.out.println(m.getName() + " never issued " + title);
		else if(!title.equals(m.getBook().getTitle()))
			System.out.println(title + " is not issued to " + m.getName());
		else if(!mbr.getName().equals(m.getName()))
			System.out.println(title + " is issued by another member");
		else {
			mbr = null;
			m.setBook(null);
		}
	}
}
