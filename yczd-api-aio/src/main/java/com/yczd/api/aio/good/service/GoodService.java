package com.yczd.api.aio.good.service;

import java.util.List;

import com.yczd.api.aio.good.domain.Good;

public interface GoodService {
	List<Good> findAll();

	Good findById(String id);

	Good findByName(String name);

	Good save(Good good);

	void delete(Good good);

	void deleteById(String id);
}
