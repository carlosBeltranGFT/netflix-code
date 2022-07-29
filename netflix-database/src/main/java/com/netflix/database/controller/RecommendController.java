package com.netflix.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.database.entities.Category;
import com.netflix.database.entities.Title;
import com.netflix.database.repositories.TitlePageableRepository;
import com.netflix.database.service.CategoryService;
import com.netflix.database.service.TitleService;

@RestController
@RequestMapping(value="api/recommend")
public class RecommendController {
	@Autowired
	private TitleService titleService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private TitlePageableRepository titlePageableRepository;
	
	@GetMapping("/best")
	public ResponseEntity findAllByOrderByRatingDesc(@RequestParam int top) {
		Pageable pageSize = Pageable.ofSize(top);
		List<Title> titulos = titlePageableRepository.findAllByOrderByUserRatingDesc(pageSize);
		
		if(titulos==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(titulos);
	}
	
	@GetMapping("/category/{id}")
	public ResponseEntity findAllByCategory(@RequestParam int top, @PathVariable int id) {
		Pageable pageSize = Pageable.ofSize(top);
		Category categoria = categoryService.findCategoryById(id);		
		List<Title> titulos = titlePageableRepository.findAllByCategoryOrderByUserRatingDesc(categoria, pageSize);
		
		if(titulos==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(titulos);

	}
	
}
