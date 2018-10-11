package com.yczd.api.aio.cart.repository;

import java.util.List;

import com.yczd.api.aio.cart.domain.Cart;

/**
 * 购物车数据库操作接口类
 * @author yczd
 *
 */
public interface CartRepository {
	public List<Cart> findAll();

	public Cart findById(String id);

	public Cart findByName(String name);

	public Integer insert(Cart cart);

	public void update(Cart cart);

	public void deleteById(String id);

	public void delete(Cart cart);
}
