package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class UsersToken {
    private Integer userTokenId;

    private Integer userId;

    private String token;

    private String refreshToken;

    private Date expiredTime;

    private Date createdOn;

    public Integer getUserTokenId() {
        return userTokenId;
    }

    public void setUserTokenId(Integer userTokenId) {
        this.userTokenId = userTokenId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken == null ? null : refreshToken.trim();
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}