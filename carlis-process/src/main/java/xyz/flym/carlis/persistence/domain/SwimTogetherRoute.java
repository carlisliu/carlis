package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class SwimTogetherRoute {
    private Integer swimTogetherRouteId;

    private Integer swimTogetherId;

    private Integer scenicSpotId;

    private Integer cityId;

    private Integer countyId;

    private Integer visitOften;

    private Integer orderNo;

    private Date createdOn;

    private Date modifiedOn;

    public Integer getSwimTogetherRouteId() {
        return swimTogetherRouteId;
    }

    public void setSwimTogetherRouteId(Integer swimTogetherRouteId) {
        this.swimTogetherRouteId = swimTogetherRouteId;
    }

    public Integer getSwimTogetherId() {
        return swimTogetherId;
    }

    public void setSwimTogetherId(Integer swimTogetherId) {
        this.swimTogetherId = swimTogetherId;
    }

    public Integer getScenicSpotId() {
        return scenicSpotId;
    }

    public void setScenicSpotId(Integer scenicSpotId) {
        this.scenicSpotId = scenicSpotId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public Integer getVisitOften() {
        return visitOften;
    }

    public void setVisitOften(Integer visitOften) {
        this.visitOften = visitOften;
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