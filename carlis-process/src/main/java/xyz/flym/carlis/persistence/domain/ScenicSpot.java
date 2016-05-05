package xyz.flym.carlis.persistence.domain;

import java.math.BigDecimal;
import java.util.Date;

public class ScenicSpot {
    private Integer scenicSpotId;

    private Integer regionId;

    private String name;

    private String nameEn;

    private BigDecimal centerPointX;

    private BigDecimal centerPointY;

    private String description;

    private String address;

    private String busLine;

    private String drivingDirections;

    private Double startLevel;

    private String history;

    private Double price;

    private Integer discount;

    private Integer startTime1;

    private Integer endTime1;

    private Integer startTime2;

    private Integer endTime2;

    private String recommendedPlaySeason;

    private String recommendedPlayTime;

    private Long commentsCount;

    private String sosTel;

    private String policeTel;

    private Date createdOn;

    private Date modifiedOn;

    private String slogan;

    private String thumbnailPath;

    private String hisThumbnailPath;

    private String imgCover;

    private String imgHotSearch;

    private String imgSearch;

    private Boolean status;

    private String createuserid;

    private String createusername;

    private String modifyuserid;

    private String modifyusername;

    private Boolean isdelete;

    private Boolean isHotSearch;

    private String imgTraffic;

    private String tags;

    public Integer getScenicSpotId() {
        return scenicSpotId;
    }

    public void setScenicSpotId(Integer scenicSpotId) {
        this.scenicSpotId = scenicSpotId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public BigDecimal getCenterPointX() {
        return centerPointX;
    }

    public void setCenterPointX(BigDecimal centerPointX) {
        this.centerPointX = centerPointX;
    }

    public BigDecimal getCenterPointY() {
        return centerPointY;
    }

    public void setCenterPointY(BigDecimal centerPointY) {
        this.centerPointY = centerPointY;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBusLine() {
        return busLine;
    }

    public void setBusLine(String busLine) {
        this.busLine = busLine == null ? null : busLine.trim();
    }

    public String getDrivingDirections() {
        return drivingDirections;
    }

    public void setDrivingDirections(String drivingDirections) {
        this.drivingDirections = drivingDirections == null ? null : drivingDirections.trim();
    }

    public Double getStartLevel() {
        return startLevel;
    }

    public void setStartLevel(Double startLevel) {
        this.startLevel = startLevel;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history == null ? null : history.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getStartTime1() {
        return startTime1;
    }

    public void setStartTime1(Integer startTime1) {
        this.startTime1 = startTime1;
    }

    public Integer getEndTime1() {
        return endTime1;
    }

    public void setEndTime1(Integer endTime1) {
        this.endTime1 = endTime1;
    }

    public Integer getStartTime2() {
        return startTime2;
    }

    public void setStartTime2(Integer startTime2) {
        this.startTime2 = startTime2;
    }

    public Integer getEndTime2() {
        return endTime2;
    }

    public void setEndTime2(Integer endTime2) {
        this.endTime2 = endTime2;
    }

    public String getRecommendedPlaySeason() {
        return recommendedPlaySeason;
    }

    public void setRecommendedPlaySeason(String recommendedPlaySeason) {
        this.recommendedPlaySeason = recommendedPlaySeason == null ? null : recommendedPlaySeason.trim();
    }

    public String getRecommendedPlayTime() {
        return recommendedPlayTime;
    }

    public void setRecommendedPlayTime(String recommendedPlayTime) {
        this.recommendedPlayTime = recommendedPlayTime == null ? null : recommendedPlayTime.trim();
    }

    public Long getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Long commentsCount) {
        this.commentsCount = commentsCount;
    }

    public String getSosTel() {
        return sosTel;
    }

    public void setSosTel(String sosTel) {
        this.sosTel = sosTel == null ? null : sosTel.trim();
    }

    public String getPoliceTel() {
        return policeTel;
    }

    public void setPoliceTel(String policeTel) {
        this.policeTel = policeTel == null ? null : policeTel.trim();
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

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan == null ? null : slogan.trim();
    }

    public String getThumbnailPath() {
        return thumbnailPath;
    }

    public void setThumbnailPath(String thumbnailPath) {
        this.thumbnailPath = thumbnailPath == null ? null : thumbnailPath.trim();
    }

    public String getHisThumbnailPath() {
        return hisThumbnailPath;
    }

    public void setHisThumbnailPath(String hisThumbnailPath) {
        this.hisThumbnailPath = hisThumbnailPath == null ? null : hisThumbnailPath.trim();
    }

    public String getImgCover() {
        return imgCover;
    }

    public void setImgCover(String imgCover) {
        this.imgCover = imgCover == null ? null : imgCover.trim();
    }

    public String getImgHotSearch() {
        return imgHotSearch;
    }

    public void setImgHotSearch(String imgHotSearch) {
        this.imgHotSearch = imgHotSearch == null ? null : imgHotSearch.trim();
    }

    public String getImgSearch() {
        return imgSearch;
    }

    public void setImgSearch(String imgSearch) {
        this.imgSearch = imgSearch == null ? null : imgSearch.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    public Boolean getIsHotSearch() {
        return isHotSearch;
    }

    public void setIsHotSearch(Boolean isHotSearch) {
        this.isHotSearch = isHotSearch;
    }

    public String getImgTraffic() {
        return imgTraffic;
    }

    public void setImgTraffic(String imgTraffic) {
        this.imgTraffic = imgTraffic == null ? null : imgTraffic.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }
}