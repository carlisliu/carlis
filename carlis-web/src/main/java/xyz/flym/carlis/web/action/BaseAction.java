package xyz.flym.carlis.web.action;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Base for all.
 * 
 * @author Carlis
 * 
 */
public class BaseAction extends ActionSupport {

	public static final String SUCCESS = "success";
	public static final String FAIL = "fail";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String status;
	protected String msg;

	protected void addJsonExecutionError(String error) {
		this.status = FAIL;
		this.msg = error;
	}

	protected boolean isSuccessed() {
		return SUCCESS.equals(this.status);
	}

	public String getStatus() {
		if (StringUtils.isEmpty(this.status)) {
			this.status = SUCCESS;
		}
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
