package com.devback.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devback.dscatalog.dto.CategoryDTO;
import com.devback.dscatalog.entities.Category;
import com.devback.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<CategoryDTO> findAll(){
		List<Category> list = repository.findAll();	
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	}
}
