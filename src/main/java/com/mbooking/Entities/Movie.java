package com.mbooking.Entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer movieId;
	String title;
	String description;
	enum type{bollywood,hollywood,tollywood,punjabi};
	String genre;
	
	
	@Column(name = "duration", insertable = false, updatable = false)
	LocalTime duration;
	
	String language;
	

	@Column(name = "releaseDate", insertable = false, updatable = false)
	LocalDate releaseDate;


	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Movie(Integer movieId, String title, String description, LocalTime duration, String language, LocalDate releaseDate,
			String genre) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.language = language;
		this.releaseDate = releaseDate;
		this.genre = genre;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", description=" + description + ", genre=" + genre
				+ ", duration=" + duration + ", language=" + language + ", releaseDate=" + releaseDate + "]";
	};
	
	
	
	
	
	
	
	
  
	
}
