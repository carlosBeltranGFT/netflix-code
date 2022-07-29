package com.netflix.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.database.entities.Title;
import com.netflix.database.service.TitleService;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/api/titles")
public class TitleController {
	@Autowired
	TitleService titleService;
	
	@GetMapping("/{id}")
    public Title findById(@PathVariable String id){
        return titleService.findById(id);
    }
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void saveTitle(@RequestBody Title title) {
		titleService.createTitle(title);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void  deleteTitle(@PathVariable String id) {
		titleService.deleteTitle(id);
	}
}