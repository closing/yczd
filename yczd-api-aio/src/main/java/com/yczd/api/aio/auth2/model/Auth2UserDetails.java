package com.yczd.api.aio.auth2.model;

import lombok.Getter;
import lombok.Setter;

public class Auth2UserDetails
{
	@Getter
	@Setter
	private com.yczd.api.aio.auth2.model.Auth2User user;

	public Auth2UserDetails(com.yczd.api.aio.auth2.model.Auth2User user) {
		//super(user.getUserName(), user.getPassword(), true, true, true, true, Collections.EMPTY_SET);
		this.user = user;
	}
}
