package xyz.flym.carlis.persistence.domain;

public class ScenicSpotExtend {
    private Integer scenicSpotExtendId;

    private Integer scenicSpotId;

    private String title;

    private String description;

    private String imgPath;

    public Integer getScenicSpotExtendId() {
        return scenicSpotExtendId;
    }

    public void setScenicSpotExtendId(Integer scenicSpotExtendId) {
        this.scenicSpotExtendId = scenicSpotExtendId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }
}