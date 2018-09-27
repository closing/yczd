package com.yczd.api.auth.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
	private Integer id;
	private String userName;
	private String password;

}
