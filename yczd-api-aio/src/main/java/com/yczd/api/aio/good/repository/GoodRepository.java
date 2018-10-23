package com.yczd.api.aio.good.repository;

import java.util.List;

import com.yczd.api.aio.good.model.Good;

/**
 * 商品数据库操作接口类
 * @author yczd
 *
 */
public interface GoodRepository {
	public List<Good> findAll();

	public Good findById(Integer id);

	public Good findByName(String name);

	public Integer insert(Good good);

	public void update(Good good);

	public void deleteById( Integer id);

	public void delete(Good good);
}
