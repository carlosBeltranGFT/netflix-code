package com.netflix.database.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.netflix.database.entities.Title;

@RepositoryRestResource(collectionResourceRel="title", path="titles")
public interface TitleRepositoryHATEOAS extends JpaRepository<Title, Integer>{
	List<Title> findByName(@Param("name") String name);
	Title findById(@Param("id") String id);
}