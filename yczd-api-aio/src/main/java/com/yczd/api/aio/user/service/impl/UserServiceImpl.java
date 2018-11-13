package com.yczd.api.aio.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yczd.api.aio.user.model.entity.User;
import com.yczd.api.aio.user.repository.UserRepository;
import com.yczd.api.aio.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User getById(String id) {

		return userRepository.findById(id);
	}

}
