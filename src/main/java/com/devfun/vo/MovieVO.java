package com.devfun.vo;

import java.util.List;

public class MovieVO {
	private String movie_id;
	private String movie_name;
	private String director;
	private String types;
	
	private List<MovieVO>movieList;

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public List<MovieVO> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<MovieVO> movieList) {
		this.movieList = movieList;
	}

	public String getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}
}
