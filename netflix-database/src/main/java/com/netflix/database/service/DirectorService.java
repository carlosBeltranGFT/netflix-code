
package com.netflix.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.database.entities.Director;
import com.netflix.database.repositories.DirectorRepository;

@Service
public class DirectorService {
    @Autowired
    DirectorRepository directorRepository;

    public Director findById(int id){
        return directorRepository.findById(id).get();
    }

    public Director createDirector(Director director){
       return directorRepository.save(director);
    }

    public void deleteDirector(int id){
        directorRepository.deleteById(id);
    }
}