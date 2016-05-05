package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class Users {
    private Integer userId;

    private String userName;

    private String password;

    private Integer mobileCode;

    private Date checkCodeTime;

    private Integer status;

    private Date createdOn;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getMobileCode() {
        return mobileCode;
    }

    public void setMobileCode(Integer mobileCode) {
        this.mobileCode = mobileCode;
    }

    public Date getCheckCodeTime() {
        return checkCodeTime;
    }

    public void setCheckCodeTime(Date checkCodeTime) {
        this.checkCodeTime = checkCodeTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}