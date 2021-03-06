package com.yczd.api.aio.shop.web.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.yczd.api.aio.shop.model.entity.Shop;
import com.yczd.api.aio.shop.model.form.ShopForm;
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

			// 数据查询 返回结果
		return shopService.getById(id).map(shop -> ResponseEntity.ok().body(shop))
				.orElse(ResponseEntity.notFound().build());

	}

	@PostMapping()
	public ResponseEntity<?> insert(@Validated @RequestBody ShopForm shopForm) {
		// 使用Validator进行参数的校验

		Shop shop = shopForm.entity();
		shopService.save(shop);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(shop.getId())
				.toUri();

		return ResponseEntity.created(location).body(shop);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<?> update(@PathVariable(name = "id") String id, @RequestBody Shop shop) {

		if (!shopService.exist(id)) {
			// TODO
			;
		}
		shopService.save(shop);
		return ResponseEntity.ok().body(shop);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) {
				if (!shopService.exist(id)) {
			// TODO
			;
		}
		shopService.deleteById(id);
		return ResponseEntity.noContent().build();

	}
}
