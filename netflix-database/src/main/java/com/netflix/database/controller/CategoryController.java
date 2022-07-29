package com.netflix.database.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netflix.database.entities.Actor;
import com.netflix.database.entities.Category;
import com.netflix.database.service.ActorService;
import com.netflix.database.service.CategoryService;


@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> regionList() {
        List<Category> categporyEntities = categoryService.getAll();

        if (categporyEntities.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(categporyEntities);
    }
	
	
}