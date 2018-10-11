package com.yczd.api.aio.category.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Category implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1682034630417641783L;
	private Integer catId;
	private String catName;
	private String catType;
	private String banner;
}
