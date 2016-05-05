package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class HotelServiceImages {
    private Integer hotelServiceImagesId;

    private Integer hotelServiceId;

    private String sourceImgPath;

    private String thumbnailPath;

    private Date createdOn;

    private Date modifiedOn;

    public Integer getHotelServiceImagesId() {
        return hotelServiceImagesId;
    }

    public void setHotelServiceImagesId(Integer hotelServiceImagesId) {
        this.hotelServiceImagesId = hotelServiceImagesId;
    }

    public Integer getHotelServiceId() {
        return hotelServiceId;
    }

    public void setHotelServiceId(Integer hotelServiceId) {
        this.hotelServiceId = hotelServiceId;
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