package com.netflix.database.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netflix.database.entities.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer>{
	Actor findByName(String name); 
}
