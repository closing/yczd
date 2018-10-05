package com.yczd.api.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class ProductIntegration {

	@Autowired
	ProductClient productClient;

	@HystrixCommand(fallbackMethod = "getDefaultDemo")
	public String getProductDemo() {
		return productClient.getProductDemo();
	}

	public String getDefaultDemo() {
		return "Default";
	}
}
