package xyz.flym.carlis.web.action.admin;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import xyz.flym.carlis.persistence.domain.Upload;
import xyz.flym.carlis.service.UploadService;
import xyz.flym.carlis.utils.Env;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * Upload product images.
 * 
 * @author Carlis
 * 
 */
public class UploadImages extends SecurityBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File uploadFile;
	private String uploadFileFileName;
	private String uploadFileContentType;
	private int productId;
	private int id;

	private UploadService uploadService;

	/**
	 * Upload image.
	 * 
	 * @return
	 * @throws Exception
	 */
	public String upload() {
		if (uploadFile != null) {
			String uploadPath = Env.getUploadPath();
			uploadPath = uploadPath.replace("/", File.separator);
			ServletContext servletContext = (ServletContext) ActionContext.getContext().get(
					ServletActionContext.SERVLET_CONTEXT);
			String fileName = genFileName();
			String fullPath = servletContext.getRealPath("/") + uploadPath + File.separator
					+ String.valueOf(this.productId) + File.separator + fileName;
			File newFile = new File(fullPath);
			if (!newFile.getParentFile().exists()) {
				newFile.getParentFile().mkdirs();
			}
			try {
				FileUtils.copyFile(uploadFile, newFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
			uploadService.saveUpload(new Upload(this.productId, fileName, this.uploadFileFileName));
		} else {
			try {
				ServletActionContext.getResponse().getWriter().write("上传文件为空");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return Action.SUCCESS;
	}

	/**
	 * Delete image
	 * 
	 * @return
	 */
	public String deleteUploadImage() {
		Upload upload = uploadService.findUploadById(id);
		if (upload == null) {
			this.addJsonExecutionError("图片不存在");
		} else {
			uploadService.deleteById(id);
			String uploadPath = Env.getUploadPath();
			uploadPath = uploadPath.replace("/", File.separator);
			ServletContext servletContext = (ServletContext) ActionContext.getContext().get(
					ServletActionContext.SERVLET_CONTEXT);
			String fileName = upload.getFileName();
			String fullPath = servletContext.getRealPath("/") + uploadPath + File.separator
					+ String.valueOf(upload.getProductId()) + File.separator + fileName;
			deleteImage(fullPath);
		}
		return Action.SUCCESS;
	}

	private void deleteImage(String path) {
		File file = new File(path);
		if (file.exists()) {
			file.delete();
		}
	}

	private String genFileName() {
		SimpleDateFormat f = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		String ext = null;
		if (StringUtils.isNotEmpty(this.uploadFileFileName)) {
			int pos = this.uploadFileFileName.lastIndexOf(".");
			ext = this.uploadFileFileName.substring(pos);
		}
		return f.format(new Date()) + (ext != null ? ext : StringUtils.EMPTY);
	}

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public UploadService getUploadService() {
		return uploadService;
	}

	public void setUploadService(UploadService uploadService) {
		this.uploadService = uploadService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
