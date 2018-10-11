package com.yczd.api.aio.order.repository.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yczd.api.aio.order.domain.Order;
import com.yczd.api.aio.order.repository.OrderRepository;

/**
 * MyBatis
 * @author yczd
 *
 */
@Repository
public class OrderDao implements OrderRepository {
	@Autowired
	private SqlSession sqlSession;

	public List<Order> findAll() {
		return sqlSession.selectList("com.yczd.api.aio.order.dao.OrderMapper.findAll");
	}

	public Order findById(String id) {
		return sqlSession.selectOne("com.yczd.api.aio.order.dao.OrderMapper.findById", id);
	}
	public void delete(Order order) {
		// TODO delete

	}

	public void update(Order order) {
		// TODO update
	}

	public Integer insert(Order order) {
		// TODO insert
		return null;
	}

	@Override
	public void deleteById(String id) {
		// TODO deleteById

	}

	@Override
	public Order findByName(String name) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
