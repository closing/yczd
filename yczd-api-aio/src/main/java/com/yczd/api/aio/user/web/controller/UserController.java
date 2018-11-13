package com.yczd.api.aio.user.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yczd.api.aio.common.result.ResponseResultUtils;
import com.yczd.api.aio.user.model.entity.User;
import com.yczd.api.aio.user.service.UserService;

@RestController
@RequestMapping("/v1/users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> user(@PathVariable() String id) {
		// 业务处理
		User user = userService.getById(id);

		// 返回结果
		if (user == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(
					ResponseResultUtils.getResponseRest(user)
							.setSuccess(true)
							.setCode(0000)
							.setMessage("正常"));
		}

	}

}
