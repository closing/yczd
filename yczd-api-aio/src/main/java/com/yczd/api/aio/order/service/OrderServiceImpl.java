package com.yczd.api.aio.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yczd.api.aio.order.domain.Order;
import com.yczd.api.aio.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Override
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public Order findById(String id) {
		return orderRepository.findById(id);
	}

	@Override
	public Order findByName(String name) {
		// TODO
		return orderRepository.findByName(name);
	}

	@Override
	public Order save(Order order) {
		// TODO
		if (order.getOrderId() == null) {
			Integer id = orderRepository.insert(order);
			order.setOrderId(id);
		} else {

		}
		return null;
	}

	@Override
	public void delete(Order order) {
		// TODO
	}

	@Override
	public void deleteById(String id) {
		// TODO

	}

}
