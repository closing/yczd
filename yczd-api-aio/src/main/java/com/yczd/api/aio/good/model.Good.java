package com.yczd.api.aio.good.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Good implements Serializable {
    private Integer goodId;

    private String goodName;

    private BigDecimal goodPrice;

    private String goodMainUrl;

    private String goodDetailUrls;

    private String goodType;

    private static final long serialVersionUID = 1L;

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public BigDecimal getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(BigDecimal goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodMainUrl() {
        return goodMainUrl;
    }

    public void setGoodMainUrl(String goodMainUrl) {
        this.goodMainUrl = goodMainUrl == null ? null : goodMainUrl.trim();
    }

    public String getGoodDetailUrls() {
        return goodDetailUrls;
    }

    public void setGoodDetailUrls(String goodDetailUrls) {
        this.goodDetailUrls = goodDetailUrls == null ? null : goodDetailUrls.trim();
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType == null ? null : goodType.trim();
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
        Good other = (Good) that;
        return (this.getGoodId() == null ? other.getGoodId() == null : this.getGoodId().equals(other.getGoodId()))
            && (this.getGoodName() == null ? other.getGoodName() == null : this.getGoodName().equals(other.getGoodName()))
            && (this.getGoodPrice() == null ? other.getGoodPrice() == null : this.getGoodPrice().equals(other.getGoodPrice()))
            && (this.getGoodMainUrl() == null ? other.getGoodMainUrl() == null : this.getGoodMainUrl().equals(other.getGoodMainUrl()))
            && (this.getGoodDetailUrls() == null ? other.getGoodDetailUrls() == null : this.getGoodDetailUrls().equals(other.getGoodDetailUrls()))
            && (this.getGoodType() == null ? other.getGoodType() == null : this.getGoodType().equals(other.getGoodType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodId() == null) ? 0 : getGoodId().hashCode());
        result = prime * result + ((getGoodName() == null) ? 0 : getGoodName().hashCode());
        result = prime * result + ((getGoodPrice() == null) ? 0 : getGoodPrice().hashCode());
        result = prime * result + ((getGoodMainUrl() == null) ? 0 : getGoodMainUrl().hashCode());
        result = prime * result + ((getGoodDetailUrls() == null) ? 0 : getGoodDetailUrls().hashCode());
        result = prime * result + ((getGoodType() == null) ? 0 : getGoodType().hashCode());
        return result;
    }
}
