package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class JourneyBaseInfo {
    private Long journeyBaseInfoId;

    private Long userId;

    private String name;

    private Long startFromId;

    private Date date;

    private Date createdOn;

    private Date modifiedOn;

    public Long getJourneyBaseInfoId() {
        return journeyBaseInfoId;
    }

    public void setJourneyBaseInfoId(Long journeyBaseInfoId) {
        this.journeyBaseInfoId = journeyBaseInfoId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getStartFromId() {
        return startFromId;
    }

    public void setStartFromId(Long startFromId) {
        this.startFromId = startFromId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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