package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class SwimTogether {
    private Integer swimTogetherId;

    private Integer userId;

    private String title;

    private Integer type;

    private Date startingTime;

    private Double cost;

    private Boolean carpooling;

    private Integer ageRange;

    private Integer sexRange;

    private String description;

    private String userLoc;

    private Integer regCount;

    private Date createdOn;

    private Date modifiedOn;

    public Integer getSwimTogetherId() {
        return swimTogetherId;
    }

    public void setSwimTogetherId(Integer swimTogetherId) {
        this.swimTogetherId = swimTogetherId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Date startingTime) {
        this.startingTime = startingTime;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Boolean getCarpooling() {
        return carpooling;
    }

    public void setCarpooling(Boolean carpooling) {
        this.carpooling = carpooling;
    }

    public Integer getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(Integer ageRange) {
        this.ageRange = ageRange;
    }

    public Integer getSexRange() {
        return sexRange;
    }

    public void setSexRange(Integer sexRange) {
        this.sexRange = sexRange;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUserLoc() {
        return userLoc;
    }

    public void setUserLoc(String userLoc) {
        this.userLoc = userLoc == null ? null : userLoc.trim();
    }

    public Integer getRegCount() {
        return regCount;
    }

    public void setRegCount(Integer regCount) {
        this.regCount = regCount;
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