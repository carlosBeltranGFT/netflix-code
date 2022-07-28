package com.netflix.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netflix.database.entities.NetflixTitles;

public interface NetflixRepository extends JpaRepository<NetflixTitles, Integer>{

}
