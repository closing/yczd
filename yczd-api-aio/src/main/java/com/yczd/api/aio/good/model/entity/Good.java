package com.yczd.api.aio.good.model.entity;

import java.io.Serializable;

public class Good implements Serializable {
    private String id;

    private String name;

    private String typeId;

    private String typeCode;

    private String shopId;

    private String usersId;

    private Double price;

    private String unit;

    private Double freight;

    private Double num;

    private Integer proGrade;

    private Integer quality;

    private String videoUrl;

    private String coverImage;

    private String intro;

    private Double supplyNum;

    private Integer isEmergency;

    private Integer isShow;

    private String showTime;

    private String shopName;

    private String stationId;

    private String stationName;

    private Integer state;

    private String shebeiCode;

    private String grade;

    private String describes;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getUsersId() {
        return usersId;
    }

    public void setUsersId(String usersId) {
        this.usersId = usersId == null ? null : usersId.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Integer getProGrade() {
        return proGrade;
    }

    public void setProGrade(Integer proGrade) {
        this.proGrade = proGrade;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage == null ? null : coverImage.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public Double getSupplyNum() {
        return supplyNum;
    }

    public void setSupplyNum(Double supplyNum) {
        this.supplyNum = supplyNum;
    }

    public Integer getIsEmergency() {
        return isEmergency;
    }

    public void setIsEmergency(Integer isEmergency) {
        this.isEmergency = isEmergency;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime == null ? null : showTime.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getShebeiCode() {
        return shebeiCode;
    }

    public void setShebeiCode(String shebeiCode) {
        this.shebeiCode = shebeiCode == null ? null : shebeiCode.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes == null ? null : describes.trim();
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
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getTypeCode() == null ? other.getTypeCode() == null : this.getTypeCode().equals(other.getTypeCode()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getUsersId() == null ? other.getUsersId() == null : this.getUsersId().equals(other.getUsersId()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getFreight() == null ? other.getFreight() == null : this.getFreight().equals(other.getFreight()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getProGrade() == null ? other.getProGrade() == null : this.getProGrade().equals(other.getProGrade()))
            && (this.getQuality() == null ? other.getQuality() == null : this.getQuality().equals(other.getQuality()))
            && (this.getVideoUrl() == null ? other.getVideoUrl() == null : this.getVideoUrl().equals(other.getVideoUrl()))
            && (this.getCoverImage() == null ? other.getCoverImage() == null : this.getCoverImage().equals(other.getCoverImage()))
            && (this.getIntro() == null ? other.getIntro() == null : this.getIntro().equals(other.getIntro()))
            && (this.getSupplyNum() == null ? other.getSupplyNum() == null : this.getSupplyNum().equals(other.getSupplyNum()))
            && (this.getIsEmergency() == null ? other.getIsEmergency() == null : this.getIsEmergency().equals(other.getIsEmergency()))
            && (this.getIsShow() == null ? other.getIsShow() == null : this.getIsShow().equals(other.getIsShow()))
            && (this.getShowTime() == null ? other.getShowTime() == null : this.getShowTime().equals(other.getShowTime()))
            && (this.getShopName() == null ? other.getShopName() == null : this.getShopName().equals(other.getShopName()))
            && (this.getStationId() == null ? other.getStationId() == null : this.getStationId().equals(other.getStationId()))
            && (this.getStationName() == null ? other.getStationName() == null : this.getStationName().equals(other.getStationName()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getShebeiCode() == null ? other.getShebeiCode() == null : this.getShebeiCode().equals(other.getShebeiCode()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getDescribes() == null ? other.getDescribes() == null : this.getDescribes().equals(other.getDescribes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getTypeCode() == null) ? 0 : getTypeCode().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getUsersId() == null) ? 0 : getUsersId().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getFreight() == null) ? 0 : getFreight().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getProGrade() == null) ? 0 : getProGrade().hashCode());
        result = prime * result + ((getQuality() == null) ? 0 : getQuality().hashCode());
        result = prime * result + ((getVideoUrl() == null) ? 0 : getVideoUrl().hashCode());
        result = prime * result + ((getCoverImage() == null) ? 0 : getCoverImage().hashCode());
        result = prime * result + ((getIntro() == null) ? 0 : getIntro().hashCode());
        result = prime * result + ((getSupplyNum() == null) ? 0 : getSupplyNum().hashCode());
        result = prime * result + ((getIsEmergency() == null) ? 0 : getIsEmergency().hashCode());
        result = prime * result + ((getIsShow() == null) ? 0 : getIsShow().hashCode());
        result = prime * result + ((getShowTime() == null) ? 0 : getShowTime().hashCode());
        result = prime * result + ((getShopName() == null) ? 0 : getShopName().hashCode());
        result = prime * result + ((getStationId() == null) ? 0 : getStationId().hashCode());
        result = prime * result + ((getStationName() == null) ? 0 : getStationName().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getShebeiCode() == null) ? 0 : getShebeiCode().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getDescribes() == null) ? 0 : getDescribes().hashCode());
        return result;
    }
}
