package com.yczd.api.aio.shop.web.controller;

import java.net.URI;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.yczd.api.aio.shop.model.Shop;
import com.yczd.api.aio.shop.service.ShopService;

@RestController
@RequestMapping("/v1/shops")
public class ShopController {
	@Autowired
	ShopService shopService;

	/**
	 *
	 * @return
	 */
	@GetMapping()
	public ResponseEntity<?> shops() {
		// 数据查询
		return ResponseEntity.ok().body(shopService.getShops());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> shop(@PathVariable String id) {

		// ============写法1:============
		// 参数的验证
		// @PathVariable 不支持注解校验
		if (!StringUtils.isNumeric(id)) {
			// 商铺ID必须是数值,如果不是数值，属于异常
		}

		Integer shopId = Integer.parseInt(id);

		// 数据查询 返回结果
		return shopService.getById(shopId).map(shop -> ResponseEntity.ok().body(shop))
				.orElse(ResponseEntity.notFound().build());

	}

	@PostMapping()
	public ResponseEntity<?> insert(@RequestBody Shop shop) {

		shopService.save(shop);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(shop.getShopId())
				.toUri();

		return ResponseEntity.created(location).body(shop);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<?> update(@PathVariable(name = "id") String id, @RequestBody Shop shop) {

		Integer shopId = Integer.parseInt(id);

		if (!shopService.exist(shopId)) {
			// TODO
			;
		}
		shopService.save(shop);
		return ResponseEntity.ok().body(shop);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) {
		Integer shopId = Integer.parseInt(id);

		if (!shopService.exist(shopId)) {
			// TODO
			;
		}
		shopService.deleteById(shopId);
		return ResponseEntity.noContent().build();

	}
}
