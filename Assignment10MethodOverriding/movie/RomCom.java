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
	

}
