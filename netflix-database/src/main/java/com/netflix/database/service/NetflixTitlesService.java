package com.netflix.database.service;


import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.database.entities.NetflixTitles;
import com.netflix.database.entities.Title;
import com.netflix.database.repositories.NetflixRepository;
import com.netflix.database.repositories.TitleRepository;


@Service
public class NetflixTitlesService {
	
	@Autowired
	private NetflixRepository NetflixTitleRepository;
	
	

    public List<NetflixTitles> getAll()
    {
        return NetflixTitleRepository.findAll();
    }
    public NetflixTitles getNetflixTitleById(int id)
    {
        return NetflixTitleRepository.findById(id).orElse(null);
    }

    public NetflixTitles save(NetflixTitles newNetflixTitle)
    {

        return NetflixTitleRepository.save(newNetflixTitle);
    }

    public NetflixTitles update(NetflixTitles NetflixTitleUpdate)
    {
        return NetflixTitleRepository.save(NetflixTitleUpdate);
    }

    public NetflixTitles delete(NetflixTitles NetflixTitleDelete)
    {
    	NetflixTitleRepository.delete(NetflixTitleDelete);
        return NetflixTitleDelete;
    }

    public void deleteById(int Id)
    {
    	NetflixTitleRepository.deleteById(Id);

    }
	
}