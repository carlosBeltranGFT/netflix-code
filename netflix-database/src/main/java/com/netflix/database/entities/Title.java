package com.netflix.database.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.netflix.database.validation.MaxCurrentYear;

@Entity
public class Title {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(unique=true)
	private String name;
	private String date_added;
	
	@Min(1900)
	@MaxCurrentYear
	private String release_year;
	
	private String rating;
	private String duration;
	private String description;
	@Min(0)
	@Max(10)
	private double userRating;
	

	@ManyToMany
	@JsonIgnore
	Set<Actor> actor;
	
	@ManyToMany
	@JsonIgnore
	Set<Director> director;
	
	@ManyToMany
	@JsonIgnore
	Set<Category> category;

	public Title() {
		super();
	}

	public Title(String id, String name, String date_added, String release_year, String rating, String duration,
			String description, double user_rating, Set<Actor> actorId, Set<Director> directorId,
			Set<Category> categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.date_added = date_added;
		this.release_year = release_year;
		this.rating = rating;
		this.duration = duration;
		this.description = description;
		this.userRating = user_rating;
		this.actor = actorId;
		this.director = directorId;
		this.category = categoryId;
	}


	@JsonIgnore
	public Set<Actor> getActorId() {
		return actor;
	}

	public void setActorId(Set<Actor> actorId) {
		this.actor = actorId;
	}


	@JsonIgnore
	public Set<Director> getDirectorId() {
		return director;
	}



	public void setDirectorId(Set<Director> directorId) {
		this.director = directorId;
	}


	@JsonIgnore
	public Set<Category> getCategoryId() {
		return category;
	}



	public void setCategoryId(Set<Category> categoryId) {
		this.category = categoryId;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUser_rating() {
		return userRating;
	}

	public void setUser_rating(double user_rating) {
		this.userRating = user_rating;
	}

	@Override
	public String toString() {
		return "Title [id=" + id + ", name=" + name + ", date_added=" + date_added + ", release_year=" + release_year
				+ ", rating=" + rating + ", duration=" + duration + ", description=" + description + ", user_rating="
				+ userRating + ", actorId=" + actor + ", directorId=" + director + ", categoryId=" + category
				+ "]";
	}
	
	
}