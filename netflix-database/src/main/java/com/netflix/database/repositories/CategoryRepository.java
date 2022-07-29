package com.netflix.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.netflix.database.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	Category findByName(String name); 
}
