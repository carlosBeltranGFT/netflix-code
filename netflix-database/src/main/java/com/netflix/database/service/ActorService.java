package com.netflix.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.database.entities.Actor;
import com.netflix.database.repositories.ActorRepository;

@Service
public class ActorService {
    @Autowired
    ActorRepository actorRepository;

    public Actor findById(int id){
        return actorRepository.findById(id).get();
    }

    public Actor createActor(Actor actor){
       return actorRepository.save(actor);
    }

    public void deleteActor(int id){
        actorRepository.deleteById(id);
    }
}