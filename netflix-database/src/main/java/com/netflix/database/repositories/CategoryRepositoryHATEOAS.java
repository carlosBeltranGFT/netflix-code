package com.netflix.database.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.netflix.database.entities.Actor;
import com.netflix.database.entities.Category;

@RepositoryRestResource(collectionResourceRel = "category", path = "categories")
public interface CategoryRepositoryHATEOAS extends JpaRepository<Category, Integer>{
	List<Category> findByName(@Param("name") String name); 
	Category findById(@Param("id") int id);
	Category deleteById(@Param("id") int id);

}
