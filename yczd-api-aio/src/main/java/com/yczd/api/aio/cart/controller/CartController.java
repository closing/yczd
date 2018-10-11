package com.yczd.api.aio.cart.controller;

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

import com.yczd.api.aio.cart.domain.Cart;
import com.yczd.api.aio.cart.service.CartService;


@RestController
@RequestMapping(value = "/v1/carts/")
public class CartController {

	@Autowired
	private CartService cartService;

	@GetMapping()
	public List<Cart> carts() {
		return cartService.findAll();
	}

	@PostMapping()
	public Cart save(@RequestBody Cart cart) {
		return cartService.save(cart);
	}

	@GetMapping(value = "/{id}")
	public Cart cart(@PathVariable String id) {
		return cartService.findById(id);

	}

	@DeleteMapping(value = "/{id}")
	public Cart delete(@RequestBody Cart cart) {
		cartService.delete(cart);
		  return cart;
	}

	@PatchMapping(value = "/{id}")
	public Cart update(@RequestBody Cart cart) {
		return cartService.save(cart);
	}

}
