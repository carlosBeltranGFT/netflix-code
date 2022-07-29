package com.netflix.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.netflix.database.entities.Director;
import com.netflix.database.entities.Title;



public interface TitleRepository extends JpaRepository<Title, Integer>{
	Title findByName(String name); 

}
