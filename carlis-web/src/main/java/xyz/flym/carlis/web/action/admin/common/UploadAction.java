package xyz.flym.carlis.web.action.admin.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.Action;

import xyz.flym.carlis.web.action.admin.SecurityBaseAction;

/**
 * 
 * @author Carlis
 *
 */
public class UploadAction extends SecurityBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private File uploadFile;
	private String uploadFileFileName;
	private String uploadFileContentType;

	public String execute() {
		if (uploadFile != null) {
			String uploadBasePath = "";
			String fullPath = "";
			File newFile = new File(fullPath);
			if (!newFile.getParentFile().exists()) {
				newFile.getParentFile().mkdirs();
			}
			try {
				FileUtils.copyFile(uploadFile, newFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			this.addJsonExecutionError("上传文件内容为空");
		}
		return Action.SUCCESS;
	}

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
