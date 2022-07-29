package com.netflix.database.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netflix.database.entities.Actor;
import com.netflix.database.entities.Director;
import com.netflix.database.entities.NetflixTitles;
import com.netflix.database.entities.Title;
import com.netflix.database.service.ActorService;
import com.netflix.database.service.DirectorService;
import com.netflix.database.service.NetflixTitlesService;
import com.netflix.database.service.TitleService;


@Controller
@RequestMapping("/title")
public class TitleController {
    @Autowired
    private TitleService titleService;

    @GetMapping
    public ResponseEntity<List<Title>> regionList() {
        List<Title> directorEntities = titleService.getAll();

        if (directorEntities.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(directorEntities);
    }
	
	
}