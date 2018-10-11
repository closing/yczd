package com.yczd.api.aio.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yczd.api.aio.order.domain.Order;
import com.yczd.api.aio.order.service.OrderService;


@RestController
@RequestMapping(value = "/v1/orders/")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping()
	public List<Order> orders() {
		return orderService.findAll();
	}

	@PostMapping()
	public Order save(@RequestBody Order order) {
		return orderService.save(order);
	}

	@GetMapping(value = "/{id}")
	public Order order(@PathVariable String id) {
		return orderService.findById(id);

	}

	@DeleteMapping(value = "/{id}")
	public Order delete(@RequestBody Order order) {
		orderService.delete(order);
		  return order;
	}

	@PatchMapping(value = "/{id}")
	public Order update(@RequestBody Order order) {
		return orderService.save(order);
	}

}
