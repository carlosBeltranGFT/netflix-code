package com.netflix.database.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "netflix_titles")
public class NetflixTitles {
	
	@Id
	private String show_id;
	private String type;
	private String title;
	private String date_added;
	private String release_year;
	private String rating;
	private String duration;
	private String description;
	private String cast;
	private String director;
	private String country;
	private String listed_in;
	private int num_ratings;
	private double user_rating;
	

	public NetflixTitles() {
		super();
	}

	
	
	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getCast() {
		return cast;
	}



	public void setCast(String cast) {
		this.cast = cast;
	}



	public String getDirector() {
		return director;
	}



	public void setDirector(String director) {
		this.director = director;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getListed_in() {
		return listed_in;
	}



	public void setListed_in(String listed_in) {
		this.listed_in = listed_in;
	}



	public String getShow_id() {
		return show_id;
	}



	public void setShow_id(String show_id) {
		this.show_id = show_id;
	}



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate_added() {
		return date_added;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	public String getRelease_year() {
		return release_year;
	}

	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getNum_ratings() {
		return num_ratings;
	}

	public void setNum_ratings(int num_ratings) {
		this.num_ratings = num_ratings;
	}

	public double getUser_rating() {
		return user_rating;
	}

	public void setUser_rating(double user_rating) {
		this.user_rating = user_rating;
	}
}
