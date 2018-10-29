package com.yczd.api.aio.good.model.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class GoodResource {

	private Integer goodId;

	private String goodName;

	private BigDecimal goodPrice;

	private String goodMainUrl;

	private String goodDetailUrls;

	private String goodType;
}
