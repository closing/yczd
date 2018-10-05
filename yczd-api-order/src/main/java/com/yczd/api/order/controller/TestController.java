package com.yczd.api.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/demo")
	public String demo() {
		return "OrderDemo";

	}

	@Autowired
	ProductIntegration product;

	@RequestMapping("/product")
	public String product() {
		return product.getProductDemo();
	}

}
