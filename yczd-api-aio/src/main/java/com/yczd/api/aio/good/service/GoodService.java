package com.yczd.api.aio.good.service;

import java.util.List;

import com.yczd.api.aio.good.model.entity.Good;

public interface GoodService {
	List<Good> getAll();

	Good getById(String id);

	Good getByName(String name);

	Good save(Good good);

	void delete(Good good);

	void deleteById(String id);
}
