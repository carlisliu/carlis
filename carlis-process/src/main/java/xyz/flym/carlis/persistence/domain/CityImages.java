package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class CityImages {
    private Integer cityImagesId;

    private Integer cityId;

    private String name;

    private String sourceImgPath;

    private String thumbnailPath;

    private Date createdOn;

    private Date modifiedOn;

    public Integer getCityImagesId() {
        return cityImagesId;
    }

    public void setCityImagesId(Integer cityImagesId) {
        this.cityImagesId = cityImagesId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSourceImgPath() {
        return sourceImgPath;
    }

    public void setSourceImgPath(String sourceImgPath) {
        this.sourceImgPath = sourceImgPath == null ? null : sourceImgPath.trim();
    }

    public String getThumbnailPath() {
        return thumbnailPath;
    }

    public void setThumbnailPath(String thumbnailPath) {
        this.thumbnailPath = thumbnailPath == null ? null : thumbnailPath.trim();
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