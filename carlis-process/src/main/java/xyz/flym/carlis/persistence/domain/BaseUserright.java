package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class BaseUserright {
    private String userrightId;

    private String userId;

    private String menuId;

    private Date createdate;

    private String createuserid;

    private String createusername;

    public String getUserrightId() {
        return userrightId;
    }

    public void setUserrightId(String userrightId) {
        this.userrightId = userrightId == null ? null : userrightId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername == null ? null : createusername.trim();
    }
}