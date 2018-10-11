package com.yczd.api.aio.good.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class Good implements Serializable {
	private Integer goodId;
	private String goodName;
	private BigDecimal goodPrice;
	private String goodMainUrl;
	private String goodDetailUrls;
	private String goodType;
}
