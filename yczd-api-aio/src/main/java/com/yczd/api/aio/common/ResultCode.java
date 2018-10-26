package com.yczd.api.aio.common.result;

/**
 *
 * 返回状态码
 *
 * @author YCZD
 *
 */

public enum ResultCode {

	/*
	 *  成功状态码
	 *
	 */
	SUCCESS(0000, "成功"),
	SUCCESS_XXXX(0001, "XXXX"),

	/*
	 *
	 */
	WARNING(1000, "警告"),
	WARNING_XXXX(1001, "XXXX警告"),

	/*
	 *
	 */
	ERROR_PARAM_INVALID(2001, "参数无效"),
	ERROR_PARAM_BLANK(2002, "参数为空"),
	ERROR_PARAM_BIND_ERROR(2003,"参数类型错误"),
	ERROR_PARAM_XXXX(2004,""),

	/* 用户错误：3001-3999*/
	ERROR_USER_NOT_LOGIN(3001, "用户未登录"),
	ERROR_USER_ERROR_LOGIN(3002, "账号不存在或密码错误"),
	ERROR_USER_FORBIDDEN(3003,"账号已被禁用"),
	ERROR_USER_NOT_EXIST(3004, "用户不存在"),
	ERROR_USER_XISTED(3005, "用户已存在"),

	ERROR_BUSINESS_ERROR(4000,""),
	/*
	 *
	 */
	ERROR_PATH_VARIABLE(5000, "URL动态参数错误"),

	FATAL(9000, "xxxx系统错误"),
	FATAL_OTHER(9999, "未知系统错误");

	private Integer code;

	private String message;

	ResultCode(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer code() {
		return this.code;
	}

	public String message() {
		return this.message;
	}

	public static String getMessage(String name) {
		for (ResultCode item : ResultCode.values()) {
			if (item.name().equals(name)) {
				return item.message;
			}
		}
		return name;
	}

	public static Integer getCode(String name) {
		for (ResultCode item : ResultCode.values()) {
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
