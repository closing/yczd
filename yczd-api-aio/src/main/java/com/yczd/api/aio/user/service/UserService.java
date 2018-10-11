package com.yczd.api.aio.user.service;

import java.util.List;

import com.yczd.api.aio.user.domain.User;

public interface UserService {
	List<User> findAll();

	User findById(String id);

	User findByName(String name);

	User save(User user);

	void delete(User user);

	void deleteById(String id);
}
