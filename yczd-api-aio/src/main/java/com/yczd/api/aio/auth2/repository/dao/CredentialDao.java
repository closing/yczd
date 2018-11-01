package com.yczd.api.aio.auth2.repository.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yczd.api.aio.auth2.model.entity.Credentials;
import com.yczd.api.aio.auth2.repository.CredentialRepository;

@Repository
public class CredentialDao implements CredentialRepository {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public Credentials getByName(String name) {

		return sqlSession
				.selectOne("com.yczd.api.aio.auth2.repository.dao.mapper.CredentialsMapper.selectByNameWithAuthrities",
						name);
	}

}
