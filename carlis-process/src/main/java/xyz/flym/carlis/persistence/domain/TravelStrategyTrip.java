package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class TravelStrategyTrip {
    private Integer travelStrategyTripId;

    private Integer travelStrategyBaseId;

    private Integer day;

    private String place;

    private String imgPath;

    private Integer scenicSpotId;

    private String scenicSpotRecommended;

    private String foodRecommended;

    private Integer orderNo;

    private Date createdOn;

    private Date modifiedOn;

    public Integer getTravelStrategyTripId() {
        return travelStrategyTripId;
    }

    public void setTravelStrategyTripId(Integer travelStrategyTripId) {
        this.travelStrategyTripId = travelStrategyTripId;
    }

    public Integer getTravelStrategyBaseId() {
        return travelStrategyBaseId;
    }

    public void setTravelStrategyBaseId(Integer travelStrategyBaseId) {
        this.travelStrategyBaseId = travelStrategyBaseId;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public Integer getScenicSpotId() {
        return scenicSpotId;
    }

    public void setScenicSpotId(Integer scenicSpotId) {
        this.scenicSpotId = scenicSpotId;
    }

    public String getScenicSpotRecommended() {
        return scenicSpotRecommended;
    }

    public void setScenicSpotRecommended(String scenicSpotRecommended) {
        this.scenicSpotRecommended = scenicSpotRecommended == null ? null : scenicSpotRecommended.trim();
    }

    public String getFoodRecommended() {
        return foodRecommended;
    }

    public void setFoodRecommended(String foodRecommended) {
        this.foodRecommended = foodRecommended == null ? null : foodRecommended.trim();
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