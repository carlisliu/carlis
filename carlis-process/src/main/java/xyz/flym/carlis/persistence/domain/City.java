package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class City {
    private Integer cityId;

    private Integer regionId;

    private String temperature;

    private String imgCover;

    private String imgSearch;

    private String thumbnailPath;

    private String description;

    private String history;

    private String recommendedPlaySeason;

    private String localtranspot;

    private String citytranspot;

    private String createuserid;

    private String createusername;

    private String modifyuserid;

    private String modifyusername;

    private Date createdOn;

    private Date modifiedOn;

    private Boolean isHotSearch;

    private String imgHotSearch;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getImgCover() {
        return imgCover;
    }

    public void setImgCover(String imgCover) {
        this.imgCover = imgCover == null ? null : imgCover.trim();
    }

    public String getImgSearch() {
        return imgSearch;
    }

    public void setImgSearch(String imgSearch) {
        this.imgSearch = imgSearch == null ? null : imgSearch.trim();
    }

    public String getThumbnailPath() {
        return thumbnailPath;
    }

    public void setThumbnailPath(String thumbnailPath) {
        this.thumbnailPath = thumbnailPath == null ? null : thumbnailPath.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history == null ? null : history.trim();
    }

    public String getRecommendedPlaySeason() {
        return recommendedPlaySeason;
    }

    public void setRecommendedPlaySeason(String recommendedPlaySeason) {
        this.recommendedPlaySeason = recommendedPlaySeason == null ? null : recommendedPlaySeason.trim();
    }

    public String getLocaltranspot() {
        return localtranspot;
    }

    public void setLocaltranspot(String localtranspot) {
        this.localtranspot = localtranspot == null ? null : localtranspot.trim();
    }

    public String getCitytranspot() {
        return citytranspot;
    }

    public void setCitytranspot(String citytranspot) {
        this.citytranspot = citytranspot == null ? null : citytranspot.trim();
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername == null ? null : createusername.trim();
    }

    public String getModifyuserid() {
        return modifyuserid;
    }

    public void setModifyuserid(String modifyuserid) {
        this.modifyuserid = modifyuserid == null ? null : modifyuserid.trim();
    }

    public String getModifyusername() {
        return modifyusername;
    }

    public void setModifyusername(String modifyusername) {
        this.modifyusername = modifyusername == null ? null : modifyusername.trim();
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

    public Boolean getIsHotSearch() {
        return isHotSearch;
    }

    public void setIsHotSearch(Boolean isHotSearch) {
        this.isHotSearch = isHotSearch;
    }

    public String getImgHotSearch() {
        return imgHotSearch;
    }

    public void setImgHotSearch(String imgHotSearch) {
        this.imgHotSearch = imgHotSearch == null ? null : imgHotSearch.trim();
    }
}