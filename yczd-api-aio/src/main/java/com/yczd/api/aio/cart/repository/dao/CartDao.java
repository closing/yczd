package com.yczd.api.aio.cart.repository.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yczd.api.aio.cart.domain.Cart;
import com.yczd.api.aio.cart.repository.CartRepository;

/**
 * MyBatis
 * @author yczd
 *
 */
@Repository
public class CartDao implements CartRepository {
	@Autowired
	private SqlSession sqlSession;

	public List<Cart> findAll() {
		return sqlSession.selectList("com.yczd.api.aio.cart.dao.CartMapper.findAll");
	}

	public Cart findById(String id) {
		return sqlSession.selectOne("com.yczd.api.aio.cart.dao.CartMapper.findById", id);
	}
	public void delete(Cart cart) {
		// TODO delete

	}

	public void update(Cart cart) {
		// TODO update
	}

	public Integer insert(Cart cart) {
		// TODO insert
		return null;
	}

	@Override
	public void deleteById(String id) {
		// TODO deleteById

	}

	@Override
	public Cart findByName(String name) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
