package com.zoho;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private static int movieId = 1;
	private int id;
	private String title;
	private String director;
	private int releaseYear;
	private String language;
	private double rating;
	
	public Movie(String title, String director, int releaseYear, String language, double rating) {
		this.id = movieId++;
		this.title = title;
		this.director = director;
		this.releaseYear = releaseYear;
		this.language = language;
		this.rating = rating;
	}
	static List<Movie> movieList = new ArrayList<>();
	public static int getMovieId() {
		return movieId;
	}
	public static void setMovieId(int movieId) {
		Movie.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	public void addMovie(Movie m) {
		movieList.add(m);
	}
	
	public static void displayAll() {
		for(Movie m:movieList) {
			System.out.println(m);
		}
	}
	
	@Override
	public String toString() {
		return "Movie [Id= " + id +", title= " + title + ", director= " + director + ", releaseYear= " + releaseYear + ", language= "
				+ language + ", rating= " + rating + "]";
	}
	
	
	
	

}
