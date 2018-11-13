package com.yczd.api.aio.common.enums;

/**
 * 系统用户定义
 * @author YCZD
 *
 */
public enum Role {
	USER(0, "买家"),
	SHOP(1, "卖家"),
	STATION(2, "服务站"),
	DRIVER(3, "司机"),
	ADMIN(8, "管理员"),
	SUPER(9, "超级管理员");

	private Integer code;
	private String name;

	Role(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	public Integer code() {
		return this.code;
	}

	public String message() {
		return this.name;
	}

	public static String getMessage(String name) {
		for (Role item : Role.values()) {
			if (item.name().equals(name)) {
				return item.name;
			}
		}
		return name;
	}

	public static Integer getCode(String name) {
		for (Role item : Role.values()) {
			if (item.name().equals(name)) {
				return item.code;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return this.name();
	}

}
