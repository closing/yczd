package com.yczd.api.aio.good.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yczd.api.aio.common.result.ResponseResultUtils;
import com.yczd.api.aio.good.model.entity.Good;
import com.yczd.api.aio.good.service.GoodService;

/**
 *
 *  /v1/goods
 *  /v1/goods?paget=&
 *  /v1/goods/{id}
 *  /v1/shops/{id}/goods/
 *  /v1/shops/{shopId}/goods/{goodId}
 *  /v1/users/{userId}/goods/
 *  /v1/users/{userId}/goods/{goodId}
 * @author YCZD
 *
 */
@RestController
@RequestMapping(value = "/v1/goods")
public class GoodController {

	@Autowired
	private GoodService goodService;

	@GetMapping()
	public ResponseEntity<?> goods() {
		return ResponseEntity.ok().body(
				ResponseResultUtils.getResponseRest(goodService.getAll())
						.setSuccess(true)
						.setCode(0000)
						.setMessage("正常"));
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> good(@PathVariable() String id) {
		// ============写法2:============
		// 参数校验及类型转换
		// @PathVariable 不支持注解校验
		if (!StringUtils.isNumeric(id)) {
			// 商品ID必须是数值,如果不是数值，属于异常
		}

		Integer goodId = Integer.parseInt(id);

		// 业务处理
		Good good = goodService.getById(goodId);

		// 返回结果
		if (good == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(
					ResponseResultUtils.getResponseRest(good)
							.setSuccess(true)
							.setCode(0000)
							.setMessage("正常"));
		}

	}
}
