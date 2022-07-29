package com.netflix.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netflix.database.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	Category findByName(String name); 
	Category findCategoryById(Integer id);
}
