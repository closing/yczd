package com.yczd.api.aio.auth.service;

import java.util.List;

import com.yczd.api.aio.auth.domain.User;

public interface UserService {
	List<User> findAll();

	User findById(String id);

	User findByName(String name);

	User save(User user);

	void delete(User user);

	void deleteById(String id);
}
