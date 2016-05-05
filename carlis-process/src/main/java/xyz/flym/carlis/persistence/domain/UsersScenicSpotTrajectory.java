package xyz.flym.carlis.persistence.domain;

import java.math.BigDecimal;
import java.util.Date;

public class UsersScenicSpotTrajectory {
    private Integer usersScenicSpotTrajectoryId;

    private Integer userId;

    private Integer scenicSpotId;

    private BigDecimal pointX;

    private BigDecimal pointY;

    private Date acquisitionTime;

    private Date createdOn;

    private Date modifiedOn;

    public Integer getUsersScenicSpotTrajectoryId() {
        return usersScenicSpotTrajectoryId;
    }

    public void setUsersScenicSpotTrajectoryId(Integer usersScenicSpotTrajectoryId) {
        this.usersScenicSpotTrajectoryId = usersScenicSpotTrajectoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getScenicSpotId() {
        return scenicSpotId;
    }

    public void setScenicSpotId(Integer scenicSpotId) {
        this.scenicSpotId = scenicSpotId;
    }

    public BigDecimal getPointX() {
        return pointX;
    }

    public void setPointX(BigDecimal pointX) {
        this.pointX = pointX;
    }

    public BigDecimal getPointY() {
        return pointY;
    }

    public void setPointY(BigDecimal pointY) {
        this.pointY = pointY;
    }

    public Date getAcquisitionTime() {
        return acquisitionTime;
    }

    public void setAcquisitionTime(Date acquisitionTime) {
        this.acquisitionTime = acquisitionTime;
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