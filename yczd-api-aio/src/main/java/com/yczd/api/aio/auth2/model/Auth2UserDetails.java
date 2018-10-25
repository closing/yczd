package com.yczd.api.aio.auth2.model;

import lombok.Getter;
import lombok.Setter;

//TODO OAuth
/**
 *
 * @author YCZD
 *
 */
public class Auth2UserDetails
{
	@Getter
	@Setter
	private com.yczd.api.aio.auth2.model.Auth2User user;

	public Auth2UserDetails(com.yczd.api.aio.auth2.model.Auth2User user) {
		this.user = user;
	}
}
