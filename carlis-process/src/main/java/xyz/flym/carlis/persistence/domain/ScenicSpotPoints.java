package xyz.flym.carlis.persistence.domain;

import java.math.BigDecimal;
import java.util.Date;

public class ScenicSpotPoints {
    private Long scenicSpotPointsId;

    private Integer scenicSpotId;

    private BigDecimal pointX;

    private BigDecimal pointY;

    private Integer type;

    private Date createdOn;

    private Date modifiedOn;

    public Long getScenicSpotPointsId() {
        return scenicSpotPointsId;
    }

    public void setScenicSpotPointsId(Long scenicSpotPointsId) {
        this.scenicSpotPointsId = scenicSpotPointsId;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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