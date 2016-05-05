package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class BaseSysloginlog {
    private String sysLoginlogId;

    private String sysLoginlogIp;

    private Date sysLoginlogTime;

    private String userAccount;

    private Integer sysLoginlogStatus;

    private String ownerAddress;

    public String getSysLoginlogId() {
        return sysLoginlogId;
    }

    public void setSysLoginlogId(String sysLoginlogId) {
        this.sysLoginlogId = sysLoginlogId == null ? null : sysLoginlogId.trim();
    }

    public String getSysLoginlogIp() {
        return sysLoginlogIp;
    }

    public void setSysLoginlogIp(String sysLoginlogIp) {
        this.sysLoginlogIp = sysLoginlogIp == null ? null : sysLoginlogIp.trim();
    }

    public Date getSysLoginlogTime() {
        return sysLoginlogTime;
    }

    public void setSysLoginlogTime(Date sysLoginlogTime) {
        this.sysLoginlogTime = sysLoginlogTime;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public Integer getSysLoginlogStatus() {
        return sysLoginlogStatus;
    }

    public void setSysLoginlogStatus(Integer sysLoginlogStatus) {
        this.sysLoginlogStatus = sysLoginlogStatus;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress == null ? null : ownerAddress.trim();
    }
}