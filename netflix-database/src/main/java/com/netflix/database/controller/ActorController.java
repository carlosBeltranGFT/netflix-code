package com.netflix.database.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netflix.database.entities.Actor;

import com.netflix.database.service.ActorService;


@Controller
@RequestMapping("/actor")
public class ActorController {
    @Autowired
    private ActorService actorService;

    @GetMapping
    public ResponseEntity<List<Actor>> regionList() {
        List<Actor> regionEntities = actorService.getAll();

        if (regionEntities.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(regionEntities);
    }
	
	
}