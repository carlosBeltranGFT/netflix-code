package com.netflix.database.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.netflix.database.entities.Category;
import com.netflix.database.entities.Title;

public interface TitlePageableRepository extends PagingAndSortingRepository<Title, Integer>{
	List<Title> findAllByOrderByUserRatingDesc(Pageable pageable);
	
	List<Title> findAllByCategoryOrderByUserRatingDesc(Category categoria, Pageable pageable);
}
