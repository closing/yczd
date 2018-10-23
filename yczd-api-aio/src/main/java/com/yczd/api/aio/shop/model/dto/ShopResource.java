package com.yczd.api.aio.shop.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ShopResource {
	private Integer shopId;
	private String shopName;
	@Getter
	private String sourceType = "Resource";

}
