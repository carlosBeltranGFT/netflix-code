package com.netflix.database.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.netflix.database.entities.Category;
import com.netflix.database.entities.Title;

public interface TitleRepository extends JpaRepository<Title, Integer>{
	Title findById(String id);	
	void deleteById(String id);
}
