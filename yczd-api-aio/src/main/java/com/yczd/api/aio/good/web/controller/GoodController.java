package com.yczd.api.aio.good.web.controller;

import org.h2.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yczd.api.aio.good.model.Good;
import com.yczd.api.aio.good.service.GoodService;

@RestController
@RequestMapping(value = "/v1/goods")
public class GoodController {

	@Autowired
	private GoodService goodService;

	@GetMapping()
	public ResponseEntity<?> goods() {
		return ResponseEntity.ok().body(goodService.findAll());
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> good(@PathVariable() String id) {
		// ============写法2:============
		// 参数校验及类型转换
		// @PathVariable 不支持注解校验
		if (!StringUtils.isNumber(id)) {
			// 商品ID必须是数值,如果不是数值，属于异常
		}

		Integer goodId = Integer.parseInt(id);

		// 业务处理
		Good good = goodService.findById(goodId);

		// 返回结果
		if (good == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(good);
		}

	}
}
