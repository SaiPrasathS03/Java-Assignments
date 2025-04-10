package com.zoho.movie;

public class RomCom extends Movie{
	String actors;
	public RomCom(String movieName, int releaseYear,String actors) {
		super(movieName, releaseYear);
		this.actors = actors;
	}
	
	public void getMovieDetails() {
		System.out.println("MovieName: "+movieName+" ReleaseYear: "+releaseYear+"Actors: "+actors);
	}

	@Override
	public void playMovie() {
		System.out.println(this.movieName+" is playing with"+this.actors);
	}
	

}
