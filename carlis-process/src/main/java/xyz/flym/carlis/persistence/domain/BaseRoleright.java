package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class BaseRoleright {
    private String rolerightId;

    private String rolesId;

    private String menuId;

    private Date createdate;

    private String createuserid;

    private String createusername;

    public String getRolerightId() {
        return rolerightId;
    }

    public void setRolerightId(String rolerightId) {
        this.rolerightId = rolerightId == null ? null : rolerightId.trim();
    }

    public String getRolesId() {
        return rolesId;
    }

    public void setRolesId(String rolesId) {
        this.rolesId = rolesId == null ? null : rolesId.trim();
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