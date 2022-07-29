package com.netflix.database.service;


import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.database.entities.Actor;
import com.netflix.database.entities.Category;
import com.netflix.database.entities.Director;
import com.netflix.database.entities.Title;
import com.netflix.database.repositories.ActorRepository;
import com.netflix.database.repositories.CategoryRepository;
import com.netflix.database.repositories.DirectorRepository;
import com.netflix.database.repositories.TitleRepository;


@Service
public class ActorService {
	
	@Autowired
	private ActorRepository actorRepository;
	
	

    public List<Actor> getAll()
    {
        return actorRepository.findAll();
    }
    
    public Actor getActorById(int id)
    {
        return actorRepository.findById(id);
    }

    public Actor save(Actor newActor)
    {

        return actorRepository.save(newActor);
    }

    public Actor update(Actor ActorUpdate)
    {
        return actorRepository.save(ActorUpdate);
    }

    public Actor delete(Actor ActorDelete)
    {
    	actorRepository.delete(ActorDelete);
        return ActorDelete;
    }

    public void deleteById(int Id)
    {
    	actorRepository.deleteById(Id);

    }
	
}