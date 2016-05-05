package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class ScenicSpotComments {
    private Integer scenicSpotCommentsId;

    private Integer scenicSpotId;

    private String title;

    private String content;

    private Integer type;

    private Long praiseCount;

    private Double score;

    private Integer userId;

    private Date createdOn;

    private Date modifiedOn;

    private Long treadCount;

    public Integer getScenicSpotCommentsId() {
        return scenicSpotCommentsId;
    }

    public void setScenicSpotCommentsId(Integer scenicSpotCommentsId) {
        this.scenicSpotCommentsId = scenicSpotCommentsId;
    }

    public Integer getScenicSpotId() {
        return scenicSpotId;
    }

    public void setScenicSpotId(Integer scenicSpotId) {
        this.scenicSpotId = scenicSpotId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(Long praiseCount) {
        this.praiseCount = praiseCount;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Long getTreadCount() {
        return treadCount;
    }

    public void setTreadCount(Long treadCount) {
        this.treadCount = treadCount;
    }
}