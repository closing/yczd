package com.yczd.api.aio.auth2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yczd.api.aio.auth2.model.entity.Credentials;
import com.yczd.api.aio.auth2.repository.CredentialRepository;
import com.yczd.api.aio.auth2.service.Auth2UserService;

@Service
public class Auth2UserDetailsServiceImpl implements Auth2UserService {
	@Autowired
	CredentialRepository credentialCustomRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Credentials credentials = credentialCustomRepository.getByName(username);

		if (credentials == null) {

			throw new UsernameNotFoundException("User" + username + "can not be found");
		}
		User user = new User(credentials.getName(), credentials.getPassword(),
				credentials.isEnabled().booleanValue(),
				true, true, true, credentials.getAuthorities());

		return user;
	}

}
