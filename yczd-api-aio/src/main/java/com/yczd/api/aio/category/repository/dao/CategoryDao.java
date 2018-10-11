package com.yczd.api.aio.category.repository.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yczd.api.aio.category.domain.Category;
import com.yczd.api.aio.category.repository.CategoryRepository;

/**
 * MyBatis
 * @author yczd
 *
 */
@Repository
public class CategoryDao implements CategoryRepository {
	@Autowired
	private SqlSession sqlSession;

	public List<Category> findAll() {
		return sqlSession.selectList("com.yczd.api.aio.category.dao.CategoryMapper.findAll");
	}

	public Category findById(String id) {
		return sqlSession.selectOne("com.yczd.api.aio.category.dao.CategoryMapper.findById", id);
	}
	public void delete(Category category) {
		// TODO delete

	}

	public void update(Category category) {
		// TODO update
	}

	public Integer insert(Category category) {
		// TODO insert
		return null;
	}

	@Override
	public void deleteById(String id) {
		// TODO deleteById

	}

	@Override
	public Category findByName(String name) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
