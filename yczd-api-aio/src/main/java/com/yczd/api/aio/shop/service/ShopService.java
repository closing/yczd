package com.yczd.api.aio.shop.service;

import java.util.List;
import java.util.Optional;

import com.yczd.api.aio.shop.model.entity.Shop;

public interface ShopService {
	public Optional<Shop> getById(Integer id);

	public List<Shop> getShops();

	public Shop save(Shop shop);

	public int delete(Shop shop);

	public int deleteById(Integer shopId);

	public boolean exist(Integer shopId);
}
