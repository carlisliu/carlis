package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class CitySpecialRecommendation {
    private Integer citySpecialRecommendationId;

    private Integer cityId;

    private String name;

    private String nameEn;

    private String pic;

    private Double price;

    private String description;

    private Integer type;

    private Date createdOn;

    private Date modifiedOn;

    private Double startLevel;

    public Integer getCitySpecialRecommendationId() {
        return citySpecialRecommendationId;
    }

    public void setCitySpecialRecommendationId(Integer citySpecialRecommendationId) {
        this.citySpecialRecommendationId = citySpecialRecommendationId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Double getStartLevel() {
        return startLevel;
    }

    public void setStartLevel(Double startLevel) {
        this.startLevel = startLevel;
    }
}