package com.yczd.api.aio.common.result;

public final class ResponseResultUtils {
	public ResponseResultUtils() {
	}

	public static <D> ResponseResult<D> getResponseRest(D data) {
		ResponseResult<D> result = new ResponseResult<>();
		result.setSuccess(true).setData(data);
		return result;
	}

	public static <D> ResponseResult<D> success() {
		ResponseResult<D> result = new ResponseResult<>();
		result.setSuccess(true);
		return result;
	}

	public static <D> ResponseResult<D> success(D data) {
		ResponseResult<D> result = new ResponseResult<>();
		result.setSuccess(true).setData(data);
		return result;
	}

	public static <D> ResponseResult<D> failure(D data) {
		ResponseResult<D> result = new ResponseResult<>();
		result.setSuccess(false).setData(data);
		return result;
	}

	public static <D> ResponseResult<D> failure(Integer code, D data) {
		ResponseResult<D> result = new ResponseResult<>();
		result.setSuccess(false).setCode(code).setData(data);
		return result;
	}
}
