package com.yczd.api.aio.common.result;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ResponseResult<D> implements Serializable {
	/**
	 *
	 */
	private D data;
	/**
	 *
	 */
	private Integer code;
	/**
	 *
	 */
	private String message;
	/**
	 *
	 */
	private boolean success;
}
