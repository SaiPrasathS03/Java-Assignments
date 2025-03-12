package com.zoho;

public class Movie {
	private static int movieId = 1;
	private String title;
	private String director;
	private int releaseYear;
	private String language;
	private float rating;
	public Movie(String title, String director, int releaseYear, String language, float rating) {
		this.movieId = movieId++;
		this.title = title;
		this.director = director;
		this.releaseYear = releaseYear;
		this.language = language;
		this.rating = rating;
	}
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
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [Id= " + movieId +"title= " + title + ", director= " + director + ", releaseYear= " + releaseYear + ", language= "
				+ language + ", rating= " + rating + "]";
	}
	
	
	

}
