package xyz.flym.carlis.persistence.domain;

import java.io.Serializable;

/**
 * 
 * @author Carlis
 *
 */
public class UserContext implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BaseAdminuserinfo baseAdminuserinfo;

	public BaseAdminuserinfo getBaseAdminuserinfo() {
		return baseAdminuserinfo;
	}

	public void setBaseAdminuserinfo(BaseAdminuserinfo baseAdminuserinfo) {
		this.baseAdminuserinfo = baseAdminuserinfo;
	}

}
