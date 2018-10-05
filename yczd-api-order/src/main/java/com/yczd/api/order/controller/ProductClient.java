package com.yczd.api.order.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("yczd-api-product")
public interface ProductClient {
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public String getProductDemo();
}
