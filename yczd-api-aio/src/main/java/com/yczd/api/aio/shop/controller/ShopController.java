package com.yczd.api.aio.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yczd.api.aio.shop.domain.Shop;
import com.yczd.api.aio.shop.service.ShopService;

@RestController
@RequestMapping("/v1/shops")
public class ShopController {
	@Autowired
	ShopService shop;

	@GetMapping("/{id}")
	public Shop cart(@PathVariable String id) {

		return shop.getById(Integer.parseInt(id));
	}
}
