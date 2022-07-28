package com.netflix.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netflix.database.entities.Title;

public interface TitleRepository extends JpaRepository<Title, Integer>{

}
