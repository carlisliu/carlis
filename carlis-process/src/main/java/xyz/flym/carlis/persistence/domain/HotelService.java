package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class HotelService {
    private Integer hotelServiceId;

    private Integer hotelId;

    private String name;

    private Double price;

    private String priceUnit;

    private Date createdOn;

    private Date modifiedOn;

    public Integer getHotelServiceId() {
        return hotelServiceId;
    }

    public void setHotelServiceId(Integer hotelServiceId) {
        this.hotelServiceId = hotelServiceId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit == null ? null : priceUnit.trim();
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