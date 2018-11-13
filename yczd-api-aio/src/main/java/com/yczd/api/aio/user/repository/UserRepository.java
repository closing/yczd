package com.yczd.api.aio.user.repository;

import com.yczd.api.aio.user.model.entity.User;

public interface UserRepository {
	User findById(String id);

}
