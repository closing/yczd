package com.yczd.api.aio.common.exception;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.yczd.api.aio.common.result.ResponseResult;
import com.yczd.api.aio.common.result.ResponseResultUtils;
import com.yczd.api.aio.common.result.ResultCode;

@RestController
@ControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * "
	 * @param e
	 * @param request
	 * @return
	 */

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e,
			HttpServletRequest request) {
		/* TODO 异常统一处理
		 * 这里仅仅为了说明同意处理
		 * */
		BindingResult bindingResult = e.getBindingResult();
		List<ObjectError> errors = bindingResult.getAllErrors();
		List<String> data = new ArrayList<String>();
		for (ObjectError error : errors) {
			data.add(error.getDefaultMessage());
		}

		ResponseEntity<ResponseResult<List<String>>> result =

				ResponseEntity.badRequest()
						.body(ResponseResultUtils.failure(ResultCode.ERROR_PARAM_INVALID.code(), data));
		return result;

	}

}
