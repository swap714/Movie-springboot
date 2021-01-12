package com.mbooking.Entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

@Entity
public class Movieshow {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer showId;
	
	@Column(name = "date", insertable = false, updatable = false)
	LocalDate date;
	
	@Column(name = "startTime", insertable = false, updatable = false)
	LocalTime startTime;
	
	@Column(name = "endTime", insertable = false, updatable = false)	
	LocalTime endTime;
		
	@Column(name="screenId")
	String screenId;
	
	@Column(name="movieId")
	Integer movieId;

	public Integer getShowId() {
		return showId;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Movieshow(Integer showId, LocalDate date, LocalTime startTime, LocalTime endTime, String screenId, Integer movieId) {
		super();
		this.showId = showId;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.screenId = screenId;
		this.movieId = movieId;
	}

	public Movieshow() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}