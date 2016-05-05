package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class TravelStrategyBase {
    private Integer cityTravelStrategyId;

    private Integer regionId;

    private String name;

    private Long praiseCount;

    private String advertisingLanguage;

    private String imgPath;

    private Date createdOn;

    private Date modifiedOn;

    public Integer getCityTravelStrategyId() {
        return cityTravelStrategyId;
    }

    public void setCityTravelStrategyId(Integer cityTravelStrategyId) {
        this.cityTravelStrategyId = cityTravelStrategyId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(Long praiseCount) {
        this.praiseCount = praiseCount;
    }

    public String getAdvertisingLanguage() {
        return advertisingLanguage;
    }

    public void setAdvertisingLanguage(String advertisingLanguage) {
        this.advertisingLanguage = advertisingLanguage == null ? null : advertisingLanguage.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}