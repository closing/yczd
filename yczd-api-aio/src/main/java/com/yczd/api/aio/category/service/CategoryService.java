package com.yczd.api.aio.category.service;

import java.util.List;

import com.yczd.api.aio.category.domain.Category;

public interface CategoryService {
	List<Category> findAll();

	Category findById(String id);

	Category findByName(String name);

	Category save(Category category);

	void delete(Category category);

	void deleteById(String id);
}
