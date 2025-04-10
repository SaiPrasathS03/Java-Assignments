package com.zoho.movie;

public class Thriller extends Movie{
	int rating;
	public Thriller(String movieName, int releaseYear,int rating) {
		super(movieName, releaseYear);
		this.rating= rating;
	}
	
	
	public void getMovieDetails() {
		System.out.println("MovieName: "+movieName+" ReleaseYear: "+releaseYear+" Rating: "+rating);
	}


	@Override
	public void playMovie() {
		System.out.println(this.movieName+" is Playing");
	}
	
}
