package com.yczd.api.aio.shop.repository;

import java.util.List;

import com.yczd.api.aio.shop.model.entity.Shop;

public interface ShopRepository {
	public Shop getShopById(Integer id);

	public List<Shop> getAll();

	public int insert(Shop shop);

	public int update(Shop shop);

	public int delete(Shop shop);

	public int deleteById(Integer shopId);

}
