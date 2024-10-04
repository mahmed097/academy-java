package com.bptn.course.hello;

class Movie {
	// Instance variables
	private String title;
	private String director;
	private double rating;

	// Default constructor
	public Movie() {
		this("Unknown", "Unknown", 0.0);
	}

	// Parameterized constructor method
	public Movie(String title, String director, double rating) {
		this.title = title;
		this.director = director;
		this.rating = rating;
	}

	// Instance method to display movie details
	public void displayDetails() {
		System.out.println("Title: " + title);
		System.out.println("Director: " + director);
		System.out.println("Rating: " + rating);
	}

	// Instance method to return current object
	public Movie getInstance() {
		return this;
	}

	// Instance method to update the rating
	public void updateRating(double newRating) {
		this.displayDetails();
		rating = newRating;
		System.out.println("The rating has been updated to " + rating);
	}

	// Instance method compare movie ratings
	public String compareRating(Movie this, Movie secondMovie) {

		if (rating > secondMovie.rating) {
			return ("The movie " + title + " is higher rated than " + secondMovie.title);
		} else {
			return ("The movie " + title + " is lower rated than " + secondMovie.title);
		}
	}

}
