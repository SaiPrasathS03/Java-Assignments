package com.zoho;

public class MainMovie {

	public static void main(String[] args) {
		Movie m1 = new Movie("Terminator" , "James Cameron", 1984,"English",4.5);
		Movie m2 = new Movie("Avengers" , "Josh Wheden", 2012,"English",4.7);
		Movie m3 = new Movie("Justice League" , "Zack Snyder", 2021,"English",4.6);
		
		m1.addMovie(m1);
		m2.addMovie(m2);
		m3.addMovie(m3);
		
		Movie.displayAll();
	}

}
