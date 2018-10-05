package com.yczd.api.account.repository.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yczd.api.account.domain.User;
import com.yczd.api.account.repository.UserRepository;

/**
 * MyBatis
 * @author yczd
 *
 */
@Repository
public class UserDao implements UserRepository {
	@Autowired
	private SqlSession sqlSession;

	public List<User> findAll() {
		return sqlSession.selectList("com.yczd.api.auth.dao.UserMapper.findAll");
	}

	public User findById(String id) {
		return sqlSession.selectOne("com.yczd.api.auth.dao.UserMapper.findById", id);
	}

	public User findByName(String userName) {
		return sqlSession.selectOne("com.yczd.api.auth.dao.UserMapper.findByName", userName);

	}

	public void delete(User user) {
		// TODO delete
		sqlSession.selectOne("com.yczd.api.auth.dao.UserMapper.findByName", user);

	}

	public void update(User user) {
		// TODO update
		sqlSession.selectOne("com.yczd.api.auth.dao.UserMapper.findByName", user);
	}

	public Integer insert(User user) {
		// TODO insert
		return sqlSession.selectOne("com.yczd.api.auth.dao.UserMapper.findByName", user);
	}

	@Override
	public void deleteById(String id) {
		// TODO deleteById
		sqlSession.delete("", id);

	}

}
