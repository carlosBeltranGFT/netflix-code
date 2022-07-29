package com.netflix.database.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.NaturalId;

@Entity
public class Actor{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	

	@NaturalId
    private String name;
    
	
    public Actor() {
		super();
	}
    
    

	public Actor(@NotEmpty String name) {
		super();
		this.name = name;
	}




	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    

    
}