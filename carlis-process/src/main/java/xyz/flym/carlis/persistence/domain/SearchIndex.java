package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class SearchIndex {
    private Integer searchIndexListId;

    private Integer regionId;

    private Integer scenicSpotCount;

    private Integer landscapeCount;

    private Date createdOn;

    private Date modifiedOn;

    public Integer getSearchIndexListId() {
        return searchIndexListId;
    }

    public void setSearchIndexListId(Integer searchIndexListId) {
        this.searchIndexListId = searchIndexListId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getScenicSpotCount() {
        return scenicSpotCount;
    }

    public void setScenicSpotCount(Integer scenicSpotCount) {
        this.scenicSpotCount = scenicSpotCount;
    }

    public Integer getLandscapeCount() {
        return landscapeCount;
    }

    public void setLandscapeCount(Integer landscapeCount) {
        this.landscapeCount = landscapeCount;
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