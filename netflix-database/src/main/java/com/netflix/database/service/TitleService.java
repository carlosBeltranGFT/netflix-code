package com.netflix.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.database.entities.Category;
import com.netflix.database.entities.Title;
import com.netflix.database.repositories.TitleRepository;

@Service
public class TitleService {

	@Autowired
	TitleRepository titleRepository;

	public Title findById(String id) {
		return titleRepository.findById(id);
	}

	public Title createTitle(Title title) {
		return titleRepository.save(title);
	}

	public void deleteTitle(String id) {
		titleRepository.deleteById(id);
	}
}