package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class ScenicSpotFeedback {
    private Integer scenicSpotFeedbackId;

    private Integer scenicSpotId;

    private Boolean type;

    private String content;

    private Integer userId;

    private Date createdOn;

    public Integer getScenicSpotFeedbackId() {
        return scenicSpotFeedbackId;
    }

    public void setScenicSpotFeedbackId(Integer scenicSpotFeedbackId) {
        this.scenicSpotFeedbackId = scenicSpotFeedbackId;
    }

    public Integer getScenicSpotId() {
        return scenicSpotId;
    }

    public void setScenicSpotId(Integer scenicSpotId) {
        this.scenicSpotId = scenicSpotId;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
}