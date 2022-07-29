package com.netflix.database.service;


import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.database.entities.Director;
import com.netflix.database.entities.Title;
import com.netflix.database.repositories.DirectorRepository;
import com.netflix.database.repositories.TitleRepository;


@Service
public class DirectorService {
	
	@Autowired
	private DirectorRepository directorRepository;
	
	

    public List<Director> getAll()
    {
        return directorRepository.findAll();
    }
    public Director getDirectorById(int id)
    {
        return directorRepository.findById(id);
    }

    public Director save(Director newDirector)
    {

        return directorRepository.save(newDirector);
    }

    public Director update(Director DirectorUpdate)
    {
        return directorRepository.save(DirectorUpdate);
    }

    public Director delete(Director DirectorDelete)
    {
    	directorRepository.delete(DirectorDelete);
        return DirectorDelete;
    }

    public void deleteById(int Id)
    {
    	directorRepository.deleteById(Id);

    }
	
}