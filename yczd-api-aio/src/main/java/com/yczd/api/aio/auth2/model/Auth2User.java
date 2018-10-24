package com.yczd.api.aio.auth2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Auth2User {

	private long userId;

	private String userName;

	private String password;

}
