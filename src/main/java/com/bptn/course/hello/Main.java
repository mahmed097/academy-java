package com.bptn.course.hello;

public class Main {

	public static void main(String[] args) {
		
		

//		// Creating new books objects
//		Book book1 = new Book("The Great Gatsby", "Scott Fitzgerald", 17.99);
//		Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 16.99);
//
//////		// Calling instance methods for first books
//////		book1.displayDetails();
//////		book1.applyDiscount(10); // Apply a 10% discount
//////
//////		// Calling instance methods for second book
//////		book2.displayDetails();
//////		book2.applyDiscount(15); // Apply a 15% discount
////
//      String compareBookResults = book1.comparePrices(book1, book2); 
//      System.out.println(compareBookResults);
//
////      Book.applyDiscount(10);
//
        // Creating new Movies objects 
        Movie movie1 = new Movie("Inception", "Christopher Nolan", 8.8);
        Movie movie2 = new Movie("Speak No Evil", "James Watkins", 7.1);
        
      // Calling instance methods for first movie 
//      movie1.displayDetails();
//      movie1.updateRating(9.0); 
//      
//      // Calling instance methods for second movie 
//      movie2.displayDetails();
//      movie2.updateRating(6.0); 

//        Default constructor example
   	  Movie movie3 = new Movie();
    movie3.displayDetails();
    movie3.updateRating(9.0); 

//      System.out.println(movie1.getInstance());
//      System.out.println(movie2.getInstance());

//      movie1.updateRating(8.0); 
//        
      String compareMovieRating = movie1.compareRating(movie2); 
      System.out.println(compareMovieRating);

	}

}
