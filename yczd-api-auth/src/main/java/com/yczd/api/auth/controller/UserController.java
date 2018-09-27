package com.yczd.api.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yczd.api.auth.domain.User;
import com.yczd.api.auth.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping()
	public List<User> users() {
		return userService.findAll();
	}

	@PostMapping()
	public User save(@RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping(value = "/{id}")
	public User user(@PathVariable String id) {
		return userService.findById(id);

	}

	@DeleteMapping(value = "/{id}")
	public User delete(@RequestBody User user) {
		  userService.delete(user);
		  return user;
	}

	@PatchMapping(value = "/{id}")
	public User update(@RequestBody User user) {
		return userService.save(user);
	}

}
