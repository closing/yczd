package com.yczd.api.aio.shop.model.form;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.BeanUtils;

import com.yczd.api.aio.shop.model.entity.Shop;

import lombok.Data;

@Data
public class ShopForm {
	private String shopId;
	@NotBlank
	private String shopName;

	public Shop entity() {
		Shop shop = new Shop();
		BeanUtils.copyProperties(this, shop);
		return shop;

	}
}
