package com.yczd.api.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yczd.api.auth.domain.User;
import com.yczd.api.auth.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(String id) {
		return userRepository.findById(id);
	}

	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public User save(User user) {
		if (user.getId() == null) {
			Integer id = userRepository.insert(user);
			user.setId(id);
		} else {

		}
		return null;
	}

	@Override
	public void delete(User user) {

	}

	@Override
	public void deleteById(String id) {

	}

}
