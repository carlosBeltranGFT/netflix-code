package com.netflix.database.service;


import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.database.entities.Title;
import com.netflix.database.repositories.TitleRepository;


@Service
public class TitleService {
	
	@Autowired
	private TitleRepository titleRepository;
	
	

    public List<Title> getAll()
    {
        return titleRepository.findAll();
    }
    public Title getTitleById(int id)
    {
        return titleRepository.findById(id).orElse(null);
    }

    public Title save(Title newTitle)
    {

        return titleRepository.save(newTitle);
    }

    public Title update(Title TitleUpdate)
    {
        return titleRepository.save(TitleUpdate);
    }

    public Title delete(Title TitleDelete)
    {
    	titleRepository.delete(TitleDelete);
        return TitleDelete;
    }

    public void deleteById(int Id)
    {
    	titleRepository.deleteById(Id);

    }
	
}