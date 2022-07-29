package com.netflix.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.database.entities.Category;
import com.netflix.database.repositories.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category findById(int id){
        return categoryRepository.findById(id).get();
    }

    public Category createCategory(Category category){
       return categoryRepository.save(category);
    }

    public void deleteCategory(int id){
        categoryRepository.deleteById(id);
    }
    
    public Category findCategoryById(int id) {
    	return categoryRepository.findCategoryById(id);
    }
}