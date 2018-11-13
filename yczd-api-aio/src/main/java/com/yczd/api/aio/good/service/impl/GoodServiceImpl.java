package com.yczd.api.aio.good.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yczd.api.aio.good.model.entity.Good;
import com.yczd.api.aio.good.repository.GoodRepository;
import com.yczd.api.aio.good.service.GoodService;

@Service
public class GoodServiceImpl implements GoodService {

	@Autowired
	GoodRepository goodRepository;

	@Override
	public List<Good> getAll() {
		return goodRepository.findAll();
	}

	@Override
	public Good getById(String id) {
		return goodRepository.findById(id);
	}

	@Override
	public Good getByName(String name) {
		// TODO
		return goodRepository.findByName(name);
	}

	@Override
	public Good save(Good good) {
		// TODO
		if (good.getId() == null) {
			goodRepository.insert(good);
		} else {

		}
		return null;
	}

	@Override
	public void delete(Good good) {
		// TODO
	}

	@Override
	public void deleteById(String id) {
		// TODO

	}

}
