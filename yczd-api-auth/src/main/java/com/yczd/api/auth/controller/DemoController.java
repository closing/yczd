package com.yczd.api.auth.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

	@GetMapping()
	public List<String> demo() {
		return Arrays.asList(new String[] { "demo" });
	}

}
