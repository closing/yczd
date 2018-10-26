package com.yczd.api.aio.shop.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yczd.api.aio.shop.model.entity.Shop;
import com.yczd.api.aio.shop.repository.ShopRepository;
import com.yczd.api.aio.shop.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	ShopRepository shopRepository;

	@Override
	public Optional<Shop> getById(Integer id) {

		return Optional.ofNullable(shopRepository.getShopById(id));
	}

	@Override
	public List<Shop> getShops() {
		List<Shop> shops = shopRepository.getShops();
		return shops;
	}

	@Override
	public Shop save(Shop shop) {

		if (shop.getShopId() == null) {
			int result = shopRepository.insert(shop);
			if (result != 1) {
				//
			}
			return shop;
		} else {
			int result = shopRepository.update(shop);
			if (result != 1) {
				//
			}
			return shop;
		}
	}

	@Override
	public int delete(Shop shop) {
		int result = shopRepository.delete(shop);
		if (result != 1) {

		}
		return result;
	}

	@Override
	public int deleteById(Integer shopId) {
		int result = shopRepository.delete(shopId);
		if (result != 1) {

		}
		return result;
	}

	@Override
	public boolean exist(Integer shopId) {
		return this.getById(shopId).isPresent();
	}

}
