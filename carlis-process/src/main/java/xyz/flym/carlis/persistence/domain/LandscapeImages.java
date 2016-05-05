package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class LandscapeImages {
    private Integer landscapeImagesId;

    private Integer landscapeId;

    private String sourceImgPath;

    private String thumbnailPath;

    private Date createdOn;

    private Date modifiedOn;

    public Integer getLandscapeImagesId() {
        return landscapeImagesId;
    }

    public void setLandscapeImagesId(Integer landscapeImagesId) {
        this.landscapeImagesId = landscapeImagesId;
    }

    public Integer getLandscapeId() {
        return landscapeId;
    }

    public void setLandscapeId(Integer landscapeId) {
        this.landscapeId = landscapeId;
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