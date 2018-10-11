package com.yczd.api.aio.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yczd.api.aio.category.domain.Category;
import com.yczd.api.aio.category.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(String id) {
		return categoryRepository.findById(id);
	}

	@Override
	public Category findByName(String name) {
		// TODO
		return categoryRepository.findByName(name);
	}

	@Override
	public Category save(Category category) {
		// TODO
		if (category.getCatId() == null) {
			Integer id = categoryRepository.insert(category);
			category.setCatId(id);
		} else {

		}
		return null;
	}

	@Override
	public void delete(Category category) {
		// TODO
	}

	@Override
	public void deleteById(String id) {
		// TODO

	}

}
