package com.zoho.movie;

public class MainMovie {

	public static void main(String[] args) {
		Movie movie = new Movie("Avengers", 2009);
		Movie romComMovie = new RomCom("LaLaLand", 2022,"Ryan Gosling Emma Stone");
		Movie thrillerMovie = new Thriller("Insidious", 2015,3);
		
		movie.getMovieDetails();
		romComMovie.getMovieDetails();
		thrillerMovie.getMovieDetails();
		
	}

}
