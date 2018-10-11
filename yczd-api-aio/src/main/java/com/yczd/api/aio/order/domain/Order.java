package com.yczd.api.aio.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class Order implements Serializable {
	private Integer orderId;
	private String goodName;
	private BigDecimal goodPrice;
	private String goodMainUrl;
	private Integer goodNum;

}
