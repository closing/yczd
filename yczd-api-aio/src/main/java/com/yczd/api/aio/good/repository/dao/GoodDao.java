package com.yczd.api.aio.good.repository.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yczd.api.aio.good.model.entity.Good;
import com.yczd.api.aio.good.repository.GoodRepository;
import com.yczd.api.aio.good.repository.dao.mapper.GoodMapper;

/**
 * MyBatis
 * @author yczd
 *
 */
@Repository
public class GoodDao implements GoodRepository {
	@Autowired
	private SqlSession sqlSession;

	public List<Good> findAll() {
		return sqlSession.getMapper(GoodMapper.class).selectAll();
	}

	public Good findById(Integer id) {
		return sqlSession.getMapper(GoodMapper.class).selectByPrimaryKey(id);
	}

	public void delete(Good good) {
		// TODO delete

	}

	public void update(Good good) {
		// TODO update
	}

	public Integer insert(Good good) {
		// TODO insert
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO deleteById

	}

	@Override
	public Good findByName(String name) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
