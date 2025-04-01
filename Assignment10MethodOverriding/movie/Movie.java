package com.zoho.movie;

public class Movie {
	String movieName;
	int releaseYear;
	public Movie(String movieName, int releaseYear) {
		super();
		this.movieName = movieName;
		this.releaseYear = releaseYear;
	}
	
	public void getMovieDetails() {
		System.out.println("MovieName: "+movieName+" ReleaseYear: "+releaseYear);
	}
	
	
}
