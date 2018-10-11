package com.yczd.api.aio.cart.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Cart implements Serializable {
	private Integer cartId;
	private Integer goodId;
	private String goodName;
	private String goodPrice;
	private String mainUrl;
	private String goodDetailUrls;
	private Integer selected;
	private Integer num;

}
