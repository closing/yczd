package com.yczd.api.aio.user.repository.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yczd.api.aio.user.model.entity.User;
import com.yczd.api.aio.user.repository.UserRepository;
import com.yczd.api.aio.user.repository.dao.mapper.UserMapper;

@Repository
public class UserDao implements UserRepository {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public User findById(String id) {
		return sqlSession.getMapper(UserMapper.class).selectByPrimaryKey(id);
	}

}
