package com.yczd.api.aio.good.repository;

import java.util.List;

import com.yczd.api.aio.good.model.entity.Good;

/**
 *
 * @author yczd
 *
 */
public interface GoodRepository {
	public List<Good> findAll();

	public Good findById(String id);

	public Good findByName(String name);

	public Integer insert(Good good);

	public void update(Good good);

	public void deleteById( String id);

	public void delete(Good good);
}
