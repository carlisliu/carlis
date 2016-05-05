package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class ScenicSpotTicket {
    private Integer scenicSpotTicketId;

    private String name;

    private String nameEn;

    private String exchangeWay;

    private String appointmentTime;

    private String refundRules;

    private Double price;

    private Integer discount;

    private Date createdOn;

    private Date modifiedOn;

    public Integer getScenicSpotTicketId() {
        return scenicSpotTicketId;
    }

    public void setScenicSpotTicketId(Integer scenicSpotTicketId) {
        this.scenicSpotTicketId = scenicSpotTicketId;
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

    public String getExchangeWay() {
        return exchangeWay;
    }

    public void setExchangeWay(String exchangeWay) {
        this.exchangeWay = exchangeWay == null ? null : exchangeWay.trim();
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime == null ? null : appointmentTime.trim();
    }

    public String getRefundRules() {
        return refundRules;
    }

    public void setRefundRules(String refundRules) {
        this.refundRules = refundRules == null ? null : refundRules.trim();
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