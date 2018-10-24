package com.yczd.api.aio.auth2.service.impl;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.yczd.api.aio.auth2.model.Auth2User;

//@Service
public class Auth2UserDetailsServiceImpl
{

	private static Set<Auth2User> users = new HashSet<>();
	static {
		users.add(new Auth2User(1, "test-user1", "123451"));
		users.add(new Auth2User(2, "test-user2", "123452"));
		users.add(new Auth2User(3, "test-user3", "123453"));
		users.add(new Auth2User(4, "test-user4", "123454"));
	}

//	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Auth2User> userWrapper = users.stream()
				.filter((u) -> u.getUserName().equals(username))
				.findFirst();
		if (!userWrapper.isPresent())
			throw new UsernameNotFoundException("there's no user founded!");
		else
//			return new MyUserDetails(userWrapper.get());
			return null;
	}

}
