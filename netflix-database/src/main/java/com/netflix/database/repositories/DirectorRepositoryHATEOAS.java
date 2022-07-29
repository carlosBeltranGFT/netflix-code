package com.netflix.database.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.netflix.database.entities.Director;
import com.netflix.database.entities.NetflixTitles;

@RepositoryRestResource(collectionResourceRel = "director", path = "directors")
public interface DirectorRepositoryHATEOAS extends JpaRepository<Director, Integer>{
	List<Director> findByName(@Param("name") String name); 
}
