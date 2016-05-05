package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class ScenicSpotActivity {
    private Integer scenicSpotActivityId;

    private Integer scenicSpotId;

    private String name;

    private String sourceImgPath;

    private String thumbnailPath;

    private String place;

    private String time;

    private String significance;

    private String content;

    private Date createdOn;

    private Date modifiedOn;

    private Boolean status;

    private String bannerImgPath;

    private String banner2ImgPath;

    private String organizer;

    public Integer getScenicSpotActivityId() {
        return scenicSpotActivityId;
    }

    public void setScenicSpotActivityId(Integer scenicSpotActivityId) {
        this.scenicSpotActivityId = scenicSpotActivityId;
    }

    public Integer getScenicSpotId() {
        return scenicSpotId;
    }

    public void setScenicSpotId(Integer scenicSpotId) {
        this.scenicSpotId = scenicSpotId;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getSignificance() {
        return significance;
    }

    public void setSignificance(String significance) {
        this.significance = significance == null ? null : significance.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getBannerImgPath() {
        return bannerImgPath;
    }

    public void setBannerImgPath(String bannerImgPath) {
        this.bannerImgPath = bannerImgPath == null ? null : bannerImgPath.trim();
    }

    public String getBanner2ImgPath() {
        return banner2ImgPath;
    }

    public void setBanner2ImgPath(String banner2ImgPath) {
        this.banner2ImgPath = banner2ImgPath == null ? null : banner2ImgPath.trim();
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer == null ? null : organizer.trim();
    }
}