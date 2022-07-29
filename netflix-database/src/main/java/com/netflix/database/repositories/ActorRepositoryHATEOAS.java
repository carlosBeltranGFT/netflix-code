package com.netflix.database.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.netflix.database.entities.Actor;

@RepositoryRestResource(collectionResourceRel = "actor", path = "actors")
public interface ActorRepositoryHATEOAS extends JpaRepository<Actor, Integer>{
	List<Actor> findByName(@Param("name") String name); 
}
