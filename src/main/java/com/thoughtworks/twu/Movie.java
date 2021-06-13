package com.thoughtworks.twu;

public class Movie {
	private MovieType type;
	private String title;

	public Movie(String title, MovieType type) {
		this.title = title;
		this.type = type;
	}

	public MovieType getType() {
		return type;
	}

	public void setType(MovieType type) {
    	this.type = type;
	}

	public String getTitle () {
		return title;
	}
}

