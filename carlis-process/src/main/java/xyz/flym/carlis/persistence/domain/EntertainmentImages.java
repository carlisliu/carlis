package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class EntertainmentImages {
    private Integer entertainmentImagesId;

    private Integer entertainmentId;

    private String sourceImgPath;

    private String thumbnailPath;

    private Date createdOn;

    private Date modifiedOn;

    public Integer getEntertainmentImagesId() {
        return entertainmentImagesId;
    }

    public void setEntertainmentImagesId(Integer entertainmentImagesId) {
        this.entertainmentImagesId = entertainmentImagesId;
    }

    public Integer getEntertainmentId() {
        return entertainmentId;
    }

    public void setEntertainmentId(Integer entertainmentId) {
        this.entertainmentId = entertainmentId;
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