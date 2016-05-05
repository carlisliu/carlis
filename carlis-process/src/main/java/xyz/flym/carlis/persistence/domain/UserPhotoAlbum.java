package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class UserPhotoAlbum {
    private Long userPhotoAlbumId;

    private Integer userId;

    private String name;

    private Date createdOn;

    private Date modifiedOn;

    public Long getUserPhotoAlbumId() {
        return userPhotoAlbumId;
    }

    public void setUserPhotoAlbumId(Long userPhotoAlbumId) {
        this.userPhotoAlbumId = userPhotoAlbumId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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