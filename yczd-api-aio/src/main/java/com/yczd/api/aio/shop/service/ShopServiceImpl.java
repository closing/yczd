package com.yczd.api.aio.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yczd.api.aio.shop.domain.Shop;
import com.yczd.api.aio.shop.repository.ShopRepository;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	ShopRepository shop;

	@Override
	public Shop getById(Integer id) {

		return shop.getShopById(id);
	}

}
