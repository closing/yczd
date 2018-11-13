package com.yczd.api.aio.shop.model.entity;

import java.io.Serializable;

public class Shop implements Serializable {
    private String id;

    private String name;

    private String provinceId;

    private String cityId;

    private String countyId;

    private String provinceName;

    private String cityName;

    private String countyName;

    private String streetId;

    private String streetName;

    private Integer state;

    private String ssId;

    private Double mapx;

    private Double mapy;

    private String shopkeeperName;

    private String shopkeeperIcon;

    private String shopAddress;

    private String email;

    private String cardNo;

    private String businessLicensePositive;

    private String businessLicenseSide;

    private String usersId;

    private String createtime;

    private Integer status;

    private String cusTel;

    private Integer grade;

    private Integer emergencyStatus;

    private Double salesVolume;

    private Integer type;

    private String cardNoF;

    private String bankUrl;

    private String taxpayerQualification;

    private String trademarkRegistration;

    private String content;

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

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId == null ? null : countyId.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }

    public String getStreetId() {
        return streetId;
    }

    public void setStreetId(String streetId) {
        this.streetId = streetId == null ? null : streetId.trim();
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName == null ? null : streetName.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getSsId() {
        return ssId;
    }

    public void setSsId(String ssId) {
        this.ssId = ssId == null ? null : ssId.trim();
    }

    public Double getMapx() {
        return mapx;
    }

    public void setMapx(Double mapx) {
        this.mapx = mapx;
    }

    public Double getMapy() {
        return mapy;
    }

    public void setMapy(Double mapy) {
        this.mapy = mapy;
    }

    public String getShopkeeperName() {
        return shopkeeperName;
    }

    public void setShopkeeperName(String shopkeeperName) {
        this.shopkeeperName = shopkeeperName == null ? null : shopkeeperName.trim();
    }

    public String getShopkeeperIcon() {
        return shopkeeperIcon;
    }

    public void setShopkeeperIcon(String shopkeeperIcon) {
        this.shopkeeperIcon = shopkeeperIcon == null ? null : shopkeeperIcon.trim();
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getBusinessLicensePositive() {
        return businessLicensePositive;
    }

    public void setBusinessLicensePositive(String businessLicensePositive) {
        this.businessLicensePositive = businessLicensePositive == null ? null : businessLicensePositive.trim();
    }

    public String getBusinessLicenseSide() {
        return businessLicenseSide;
    }

    public void setBusinessLicenseSide(String businessLicenseSide) {
        this.businessLicenseSide = businessLicenseSide == null ? null : businessLicenseSide.trim();
    }

    public String getUsersId() {
        return usersId;
    }

    public void setUsersId(String usersId) {
        this.usersId = usersId == null ? null : usersId.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCusTel() {
        return cusTel;
    }

    public void setCusTel(String cusTel) {
        this.cusTel = cusTel == null ? null : cusTel.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getEmergencyStatus() {
        return emergencyStatus;
    }

    public void setEmergencyStatus(Integer emergencyStatus) {
        this.emergencyStatus = emergencyStatus;
    }

    public Double getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Double salesVolume) {
        this.salesVolume = salesVolume;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCardNoF() {
        return cardNoF;
    }

    public void setCardNoF(String cardNoF) {
        this.cardNoF = cardNoF == null ? null : cardNoF.trim();
    }

    public String getBankUrl() {
        return bankUrl;
    }

    public void setBankUrl(String bankUrl) {
        this.bankUrl = bankUrl == null ? null : bankUrl.trim();
    }

    public String getTaxpayerQualification() {
        return taxpayerQualification;
    }

    public void setTaxpayerQualification(String taxpayerQualification) {
        this.taxpayerQualification = taxpayerQualification == null ? null : taxpayerQualification.trim();
    }

    public String getTrademarkRegistration() {
        return trademarkRegistration;
    }

    public void setTrademarkRegistration(String trademarkRegistration) {
        this.trademarkRegistration = trademarkRegistration == null ? null : trademarkRegistration.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getProvinceId() == null ? other.getProvinceId() == null : this.getProvinceId().equals(other.getProvinceId()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getCountyId() == null ? other.getCountyId() == null : this.getCountyId().equals(other.getCountyId()))
            && (this.getProvinceName() == null ? other.getProvinceName() == null : this.getProvinceName().equals(other.getProvinceName()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getCountyName() == null ? other.getCountyName() == null : this.getCountyName().equals(other.getCountyName()))
            && (this.getStreetId() == null ? other.getStreetId() == null : this.getStreetId().equals(other.getStreetId()))
            && (this.getStreetName() == null ? other.getStreetName() == null : this.getStreetName().equals(other.getStreetName()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getSsId() == null ? other.getSsId() == null : this.getSsId().equals(other.getSsId()))
            && (this.getMapx() == null ? other.getMapx() == null : this.getMapx().equals(other.getMapx()))
            && (this.getMapy() == null ? other.getMapy() == null : this.getMapy().equals(other.getMapy()))
            && (this.getShopkeeperName() == null ? other.getShopkeeperName() == null : this.getShopkeeperName().equals(other.getShopkeeperName()))
            && (this.getShopkeeperIcon() == null ? other.getShopkeeperIcon() == null : this.getShopkeeperIcon().equals(other.getShopkeeperIcon()))
            && (this.getShopAddress() == null ? other.getShopAddress() == null : this.getShopAddress().equals(other.getShopAddress()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCardNo() == null ? other.getCardNo() == null : this.getCardNo().equals(other.getCardNo()))
            && (this.getBusinessLicensePositive() == null ? other.getBusinessLicensePositive() == null : this.getBusinessLicensePositive().equals(other.getBusinessLicensePositive()))
            && (this.getBusinessLicenseSide() == null ? other.getBusinessLicenseSide() == null : this.getBusinessLicenseSide().equals(other.getBusinessLicenseSide()))
            && (this.getUsersId() == null ? other.getUsersId() == null : this.getUsersId().equals(other.getUsersId()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCusTel() == null ? other.getCusTel() == null : this.getCusTel().equals(other.getCusTel()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getEmergencyStatus() == null ? other.getEmergencyStatus() == null : this.getEmergencyStatus().equals(other.getEmergencyStatus()))
            && (this.getSalesVolume() == null ? other.getSalesVolume() == null : this.getSalesVolume().equals(other.getSalesVolume()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCardNoF() == null ? other.getCardNoF() == null : this.getCardNoF().equals(other.getCardNoF()))
            && (this.getBankUrl() == null ? other.getBankUrl() == null : this.getBankUrl().equals(other.getBankUrl()))
            && (this.getTaxpayerQualification() == null ? other.getTaxpayerQualification() == null : this.getTaxpayerQualification().equals(other.getTaxpayerQualification()))
            && (this.getTrademarkRegistration() == null ? other.getTrademarkRegistration() == null : this.getTrademarkRegistration().equals(other.getTrademarkRegistration()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getProvinceId() == null) ? 0 : getProvinceId().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getCountyId() == null) ? 0 : getCountyId().hashCode());
        result = prime * result + ((getProvinceName() == null) ? 0 : getProvinceName().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getCountyName() == null) ? 0 : getCountyName().hashCode());
        result = prime * result + ((getStreetId() == null) ? 0 : getStreetId().hashCode());
        result = prime * result + ((getStreetName() == null) ? 0 : getStreetName().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getSsId() == null) ? 0 : getSsId().hashCode());
        result = prime * result + ((getMapx() == null) ? 0 : getMapx().hashCode());
        result = prime * result + ((getMapy() == null) ? 0 : getMapy().hashCode());
        result = prime * result + ((getShopkeeperName() == null) ? 0 : getShopkeeperName().hashCode());
        result = prime * result + ((getShopkeeperIcon() == null) ? 0 : getShopkeeperIcon().hashCode());
        result = prime * result + ((getShopAddress() == null) ? 0 : getShopAddress().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCardNo() == null) ? 0 : getCardNo().hashCode());
        result = prime * result + ((getBusinessLicensePositive() == null) ? 0 : getBusinessLicensePositive().hashCode());
        result = prime * result + ((getBusinessLicenseSide() == null) ? 0 : getBusinessLicenseSide().hashCode());
        result = prime * result + ((getUsersId() == null) ? 0 : getUsersId().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCusTel() == null) ? 0 : getCusTel().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getEmergencyStatus() == null) ? 0 : getEmergencyStatus().hashCode());
        result = prime * result + ((getSalesVolume() == null) ? 0 : getSalesVolume().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCardNoF() == null) ? 0 : getCardNoF().hashCode());
        result = prime * result + ((getBankUrl() == null) ? 0 : getBankUrl().hashCode());
        result = prime * result + ((getTaxpayerQualification() == null) ? 0 : getTaxpayerQualification().hashCode());
        result = prime * result + ((getTrademarkRegistration() == null) ? 0 : getTrademarkRegistration().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}
