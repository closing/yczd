package com.yczd.api.aio.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yczd.api.aio.cart.domain.Cart;
import com.yczd.api.aio.cart.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRep;

	@Override
	public List<Cart> findAll() {
		return cartRep.findAll();
	}

	@Override
	public Cart findById(String id) {
		return cartRep.findById(id);
	}

	@Override
	public Cart findByName(String name) {
		// TODO
		return cartRep.findByName(name);
	}

	@Override
	public Cart save(Cart cart) {
		// TODO
		if (cart.getCartId() == null) {
			Integer id = cartRep.insert(cart);
			cart.setCartId(id);
		} else {

		}
		return null;
	}

	@Override
	public void delete(Cart cart) {
		// TODO
	}

	@Override
	public void deleteById(String id) {
		// TODO

	}

}
