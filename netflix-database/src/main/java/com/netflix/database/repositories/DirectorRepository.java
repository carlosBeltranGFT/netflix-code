package com.netflix.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netflix.database.entities.Director;
import com.netflix.database.entities.NetflixTitles;

public interface DirectorRepository extends JpaRepository<Director, Integer>{
	Director findByName(String name); 
}
