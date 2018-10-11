package com.yczd.api.aio.order.service;

import java.util.List;

import com.yczd.api.aio.order.domain.Order;

public interface OrderService {
	List<Order> findAll();

	Order findById(String id);

	Order findByName(String name);

	Order save(Order order);

	void delete(Order order);

	void deleteById(String id);
}
