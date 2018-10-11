package com.yczd.api.aio.user.repository.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yczd.api.aio.user.domain.User;
import com.yczd.api.aio.user.repository.UserRepository;

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
		return sqlSession.selectList("com.yczd.api.aio.user.dao.UserMapper.findAll");
	}

	public User findById(String id) {
		return sqlSession.selectOne("com.yczd.api.aio.user.dao.UserMapper.findById", id);
	}

	public Integer update(User user) {
		return sqlSession.update("com.yczd.api.aio.user.dao.UserMapper.update", user);
	}

	public Integer insert(User user) {
		return sqlSession.update("com.yczd.api.aio.user.dao.UserMapper.insert", user);
	}
	public User findByName(String userName) {
		// TODO
		return null;

	}

	public void delete(User user) {
		sqlSession.delete("com.yczd.api.aio.user.dao.UserMapper.delete", user);

	}

	@Override
	public void deleteById(String id) {
		// TODO deleteById
		sqlSession.delete("", id);

	}

}
