package com.yczd.api.aio.auth.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 7502724873241655606L;
	private Integer id;
	private String userName;
	private String password;

}
