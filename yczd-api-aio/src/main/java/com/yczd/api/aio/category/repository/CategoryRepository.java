package com.yczd.api.aio.category.repository;

import java.util.List;

import com.yczd.api.aio.category.domain.Category;

/**
 * 商品类别数据库操作接口类
 * @author yczd
 *
 */
public interface CategoryRepository {
	public List<Category> findAll();

	public Category findById(String id);

	public Category findByName(String name);

	public Integer insert(Category category);

	public void update(Category category);

	public void deleteById(String id);

	public void delete(Category category);
}
