package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class BaseRoles {
    private String rolesId;

    private String parentid;

    private String rolesName;

    private String roleRestriction;

    private String rolesRemark;

    private Integer allowedit;

    private Integer allowdelete;

    private Integer sortcode;

    private Integer deletemark;

    private Date createdate;

    private String createuserid;

    private String createusername;

    private Date modifydate;

    private String modifyuserid;

    private String modifyusername;

    public String getRolesId() {
        return rolesId;
    }

    public void setRolesId(String rolesId) {
        this.rolesId = rolesId == null ? null : rolesId.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getRolesName() {
        return rolesName;
    }

    public void setRolesName(String rolesName) {
        this.rolesName = rolesName == null ? null : rolesName.trim();
    }

    public String getRoleRestriction() {
        return roleRestriction;
    }

    public void setRoleRestriction(String roleRestriction) {
        this.roleRestriction = roleRestriction == null ? null : roleRestriction.trim();
    }

    public String getRolesRemark() {
        return rolesRemark;
    }

    public void setRolesRemark(String rolesRemark) {
        this.rolesRemark = rolesRemark == null ? null : rolesRemark.trim();
    }

    public Integer getAllowedit() {
        return allowedit;
    }

    public void setAllowedit(Integer allowedit) {
        this.allowedit = allowedit;
    }

    public Integer getAllowdelete() {
        return allowdelete;
    }

    public void setAllowdelete(Integer allowdelete) {
        this.allowdelete = allowdelete;
    }

    public Integer getSortcode() {
        return sortcode;
    }

    public void setSortcode(Integer sortcode) {
        this.sortcode = sortcode;
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
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

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getModifyuserid() {
        return modifyuserid;
    }

    public void setModifyuserid(String modifyuserid) {
        this.modifyuserid = modifyuserid == null ? null : modifyuserid.trim();
    }

    public String getModifyusername() {
        return modifyusername;
    }

    public void setModifyusername(String modifyusername) {
        this.modifyusername = modifyusername == null ? null : modifyusername.trim();
    }
}