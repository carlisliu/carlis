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
	protected String message;

	protected void addJsonExecutionError(String error) {
		this.status = FAIL;
		this.message = error;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
