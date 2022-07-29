package com.netflix.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.database.entities.Actor;
import com.netflix.database.service.ActorService;


@RestController
@RequestMapping("/api/actor")
public class ActorController {
	@Autowired
	ActorService actorService;
	@GetMapping("/{id}")
    public Actor findById(@PathVariable int id){
        return actorService.findById(id);
    }

}