package com.yczd.api.aio.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yczd.api.aio.category.domain.Category;
import com.yczd.api.aio.category.service.CategoryService;


@RestController
@RequestMapping(value = "/v1/categories/")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping()
	public List<Category> categories() {
		return categoryService.findAll();
	}

	@PostMapping()
	public Category save(@RequestBody Category category) {
		return categoryService.save(category);
	}

	@GetMapping(value = "/{id}")
	public Category category(@PathVariable String id) {
		return categoryService.findById(id);

	}

	@DeleteMapping(value = "/{id}")
	public Category delete(@RequestBody Category category) {
		categoryService.delete(category);
		  return category;
	}

	@PatchMapping(value = "/{id}")
	public Category update(@RequestBody Category category) {
		return categoryService.save(category);
	}

}
