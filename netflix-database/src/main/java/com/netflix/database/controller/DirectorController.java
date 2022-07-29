package com.netflix.database.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netflix.database.entities.Actor;
import com.netflix.database.entities.Director;
import com.netflix.database.service.ActorService;
import com.netflix.database.service.DirectorService;


@Controller
@RequestMapping("/director")
public class DirectorController {
    @Autowired
    private DirectorService directorService;

    @GetMapping
    public ResponseEntity<List<Director>> regionList() {
        List<Director> directorEntities = directorService.getAll();

        if (directorEntities.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(directorEntities);
    }
	
	
}