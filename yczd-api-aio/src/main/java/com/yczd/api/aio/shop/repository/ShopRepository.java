package com.yczd.api.aio.shop.repository;

import java.util.List;

import com.yczd.api.aio.shop.model.Shop;

public interface ShopRepository {
	public Shop getShopById(Integer id);

	public List<Shop> getShops();

	public int insert(Shop shop);

	public int update(Shop shop);

	public int delete(Shop shop);

	public int delete(Integer shopId);

}
