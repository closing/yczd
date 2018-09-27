package com.yczd.api.auth.repository;

import java.util.List;

import com.yczd.api.auth.domain.User;

/**
 * 用户数据库操作接口类
 * @author yczd
 *
 */
public interface UserRepository {
	public List<User> findAll();

	public User findById(String id);

	public User findByName(String userName);

	public Integer insert(User user);

	public void update(User user);

	public void deleteById(String id);

	public void delete(User user);
}
