package com.netflix.database.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.netflix.database.entities.Actor;


public interface ActorRepository extends JpaRepository<Actor, Integer>{
	Actor findByName(String name); 
	Actor findById(@Param("id") int id);
	@SuppressWarnings("unchecked")
	Actor save(Actor actor);
}
