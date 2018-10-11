package com.yczd.api.aio.order.repository;

import java.util.List;

import com.yczd.api.aio.order.domain.Order;

/**
 * 订单数据库操作接口类
 * @author yczd
 *
 */
public interface OrderRepository {
	public List<Order> findAll();

	public Order findById(String id);

	public Order findByName(String name);

	public Integer insert(Order order);

	public void update(Order order);

	public void deleteById(String id);

	public void delete(Order order);
}
