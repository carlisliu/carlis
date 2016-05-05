package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class LandscapeType {
    private Integer landscapeTypeId;

    private String name;

    private Integer orderNo;

    private Date createdOn;

    public Integer getLandscapeTypeId() {
        return landscapeTypeId;
    }

    public void setLandscapeTypeId(Integer landscapeTypeId) {
        this.landscapeTypeId = landscapeTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}