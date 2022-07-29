package com.netflix.database.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.netflix.database.entities.Title;



public interface TitleRepository extends JpaRepository<Title, Integer>{
	Title findByName(String name); 
	Title findById(@Param("id") int id);
	
	@Query(value = " select * from title order by user_rating DESC ", nativeQuery = true)
    List<Title> bestTitles();
}
