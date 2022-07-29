package com.netflix.database.service;


import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.database.entities.Category;
import com.netflix.database.entities.Director;
import com.netflix.database.entities.Title;
import com.netflix.database.repositories.CategoryRepository;
import com.netflix.database.repositories.DirectorRepository;
import com.netflix.database.repositories.TitleRepository;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	

    public List<Category> getAll()
    {
        return categoryRepository.findAll();
    }
    public Category getCategoryById(int id)
    {
        return categoryRepository.findById(id);
    }

    public Category save(Category newCategory)
    {

        return categoryRepository.save(newCategory);
    }

    public Category update(Category CategoryUpdate)
    {
        return categoryRepository.save(CategoryUpdate);
    }

    public Category delete(Category CategoryDelete)
    {
    	categoryRepository.delete(CategoryDelete);
        return CategoryDelete;
    }

    public void deleteById(int Id)
    {
    	categoryRepository.deleteById(Id);

    }
	
}