package com.yczd.api.aio.good.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yczd.api.aio.good.domain.Good;
import com.yczd.api.aio.good.service.GoodService;


@RestController
@RequestMapping(value = "/v1/goods")
public class GoodController {

	@Autowired
	private GoodService goodService;

	@GetMapping()
	public List<Good> goods() {
		return goodService.findAll();
	}

	@PostMapping()
	public Good save(@RequestBody Good good) {
		return goodService.save(good);
	}

	@GetMapping(value = "/{id}")
	public Good good(@PathVariable String id) {
		return goodService.findById(id);

	}

	@DeleteMapping(value = "/{id}")
	public Good delete(@RequestBody Good good) {
		goodService.delete(good);
		  return good;
	}

	@PatchMapping(value = "/{id}")
	public Good update(@RequestBody Good good) {
		return goodService.save(good);
	}

}
