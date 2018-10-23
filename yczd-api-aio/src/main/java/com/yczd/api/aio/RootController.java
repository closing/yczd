package com.yczd.api.aio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {

	@GetMapping()
	public List<String> root() {
		List<String> links = new ArrayList<>();

		links.add("/v1/goods/");
		links.add("/v1/categories/");
		links.add("/v1/carts/");
		links.add("/v1/orders/");
		links.add("/v1/users/");
		links.add("/v1/shops/");

		return links;

	}
}
