package com.yczd.api.aio.auth2.model;

import lombok.Data;

//TODO OAuth
/**
*
* @author YCZD
*
*/
@Data
public class Auth2TokenInfo {

	private String access_token;
	private String token_type;
	private String refresh_token;
	private int expires_in;
	private String scope;
}
