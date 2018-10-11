package com.yczd.api.aio.user.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 7502724873241655606L;
	private Integer userId;
	private String userName;
	private String password;
	private String gender;
	private String name;
	private Integer age;

}
