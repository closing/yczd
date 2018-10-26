package com.yczd.api.aio.shop.model.entity;

import java.io.Serializable;

public class Shop implements Serializable {
    private Integer shopId;

    private String shopName;

    private static final long serialVersionUID = 1L;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Shop other = (Shop) that;
        return (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getShopName() == null ? other.getShopName() == null : this.getShopName().equals(other.getShopName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getShopName() == null) ? 0 : getShopName().hashCode());
        return result;
    }
}
