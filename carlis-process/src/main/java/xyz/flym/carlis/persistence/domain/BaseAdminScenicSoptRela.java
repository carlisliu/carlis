package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class BaseAdminScenicSoptRela {
    private String amdinUserid;

    private Integer scenicSpotId;

    private Date createdOn;

    public String getAmdinUserid() {
        return amdinUserid;
    }

    public void setAmdinUserid(String amdinUserid) {
        this.amdinUserid = amdinUserid == null ? null : amdinUserid.trim();
    }

    public Integer getScenicSpotId() {
        return scenicSpotId;
    }

    public void setScenicSpotId(Integer scenicSpotId) {
        this.scenicSpotId = scenicSpotId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}