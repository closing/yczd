package com.yczd.api.aio.cart.service;

import java.util.List;

import com.yczd.api.aio.cart.domain.Cart;

public interface CartService {
	List<Cart> findAll();

	Cart findById(String id);

	Cart findByName(String name);

	Cart save(Cart cart);

	void delete(Cart cart);

	void deleteById(String id);
}
