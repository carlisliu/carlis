package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class DishesImages {
    private Integer dishesImagesId;

    private Integer dishesId;

    private String sourceImgPath;

    private String thumbnailPath;

    private Date createdOn;

    private Date modifiedOn;

    public Integer getDishesImagesId() {
        return dishesImagesId;
    }

    public void setDishesImagesId(Integer dishesImagesId) {
        this.dishesImagesId = dishesImagesId;
    }

    public Integer getDishesId() {
        return dishesId;
    }

    public void setDishesId(Integer dishesId) {
        this.dishesId = dishesId;
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