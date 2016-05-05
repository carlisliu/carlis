package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class UserPhotoAlbumImages {
    private Long userPhotoAlbumImagesId;

    private Integer userPhotoAlbumId;

    private String sourceImgPath;

    private String thumbnailPath;

    private String listImgPath;

    private Date createdOn;

    private Date modifiedOn;

    public Long getUserPhotoAlbumImagesId() {
        return userPhotoAlbumImagesId;
    }

    public void setUserPhotoAlbumImagesId(Long userPhotoAlbumImagesId) {
        this.userPhotoAlbumImagesId = userPhotoAlbumImagesId;
    }

    public Integer getUserPhotoAlbumId() {
        return userPhotoAlbumId;
    }

    public void setUserPhotoAlbumId(Integer userPhotoAlbumId) {
        this.userPhotoAlbumId = userPhotoAlbumId;
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

    public String getListImgPath() {
        return listImgPath;
    }

    public void setListImgPath(String listImgPath) {
        this.listImgPath = listImgPath == null ? null : listImgPath.trim();
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