package com.bptn.course.hello;

class Book {
	// Instance variables
	private String title;
	private String author;
	private double price;

	// Parameterized constructor method
	public Book(String title, String author, double price) {

		this.title = title;
		this.author = author;
		this.price = price;
	}

	// Instance method to display book details
	public void displayDetails() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Price: $" + this.price);
	}

	// Instance method to apply discount
	public void applyDiscount(double discountPercent) {
		this.price -= this.price * (discountPercent / 100);
		System.out.println("New price after discount: $" + this.price);
	}

	// Static method to compare book prices
	public static String comparePrices(Book book1, Book book2) {

		
		if (book1.price > book2.price) {
			return ("The book " + book1.title + " costs more than " + book2.title);
		} else {
			return ("The book " + book1.title + " costs less than " + book2.title);
		}
	}

}
