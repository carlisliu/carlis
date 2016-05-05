package xyz.flym.carlis.persistence.domain;

import java.math.BigDecimal;
import java.util.Date;

public class ScenicSpotSos {
    private Integer scenicSpotSosId;

    private Integer userId;

    private Integer sosType;

    private String content;

    private Integer contentType;

    private String phone;

    private BigDecimal pointX;

    private BigDecimal pointY;

    private Date createdOn;

    private Date modifiedOn;

    private Integer status;

    public Integer getScenicSpotSosId() {
        return scenicSpotSosId;
    }

    public void setScenicSpotSosId(Integer scenicSpotSosId) {
        this.scenicSpotSosId = scenicSpotSosId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSosType() {
        return sosType;
    }

    public void setSosType(Integer sosType) {
        this.sosType = sosType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}