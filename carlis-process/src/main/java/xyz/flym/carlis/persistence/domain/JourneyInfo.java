package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class JourneyInfo {
    private Long journeyInfoId;

    private Long journeyBaseInfoId;

    private Long cityId;

    private Long countyId;

    private Integer time;

    private Integer orderNo;

    private Date createdOn;

    private Date modifiedOn;

    public Long getJourneyInfoId() {
        return journeyInfoId;
    }

    public void setJourneyInfoId(Long journeyInfoId) {
        this.journeyInfoId = journeyInfoId;
    }

    public Long getJourneyBaseInfoId() {
        return journeyBaseInfoId;
    }

    public void setJourneyBaseInfoId(Long journeyBaseInfoId) {
        this.journeyBaseInfoId = journeyBaseInfoId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
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