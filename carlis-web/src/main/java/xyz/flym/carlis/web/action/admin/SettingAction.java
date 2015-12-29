package xyz.flym.carlis.web.action.admin;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import xyz.flym.carlis.persistence.domain.Picture;
import xyz.flym.carlis.persistence.domain.Setting;
import xyz.flym.carlis.service.PictureService;
import xyz.flym.carlis.service.SettingService;
import xyz.flym.carlis.web.utils.UploadUtil;

import com.opensymphony.xwork2.Action;

/**
 * 
 * @author Carlis
 * 
 */
public class SettingAction extends SecurityBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SettingService settingService;
	private PictureService pictureService;
	private Setting setting;
	private Picture picture;
	private String type;
	private File uploadObj;
	private String uploadObjFileName;
	private List<Picture> banners;
	private List<Picture> process;

	/**
	 * Query all setting info.
	 */
	public String execute() {
		this.setting = settingService.find();
		this.banners = pictureService.findPicturesByType("banner");
		this.process = pictureService.findPicturesByType("process");
		return Action.SUCCESS;
	}

	/**
	 * 
	 * @return
	 */
	public String saveNumbers() {
		if (this.setting != null) {
			Setting existed = settingService.find();
			if (existed != null) {
				existed.setBannerNum(this.setting.getBannerNum());
				existed.setProcessNum(this.setting.getProcessNum());
				if (StringUtils.isNotEmpty(this.setting.getQq())) {
					existed.setQq(this.setting.getQq());
				}
				settingService.update(existed);
			} else {
				settingService.save(this.setting);
			}
		} else {
			this.addJsonExecutionError("图片数量设置信息为空");
		}
		return Action.SUCCESS;
	}

	/**
	 * Upload file
	 * 
	 * @return
	 */
	public String upload() {
		if (StringUtils.isEmpty(this.type) || this.uploadObj == null) {
			this.addJsonExecutionError("上传信息不完整，请选择正确的文件");
		} else {
			String parentPath = UploadUtil.getUploadPath(this.type);
			String fileName = null;
			boolean deleteFirst = false;
			if ("process".equals(this.type) || "banner".equals(this.type)) {
				fileName = genFileName(this.type);
			} else {
				fileName = this.type + ext();
				// logo,icon and wechat qrcode only have one, so if exists,
				// delete it, then create a new one.
				deleteFirst = true;
			}
			File file = new File(parentPath + File.separator + fileName);
			if (!file.exists()) {
				file.getParentFile().mkdirs();
			} else {
				if (deleteFirst) {
					file.delete();
				}
			}
			try {
				FileUtils.copyFile(uploadObj, file);
			} catch (IOException e) {
				e.printStackTrace();
				this.addJsonExecutionError(e.getMessage());
				return Action.SUCCESS;
			}
			if ("process".equals(this.type) || "banner".equals(this.type)) {
				if (this.picture != null) {
					this.picture.setFileName(fileName);
					pictureService.save(this.picture);
				} else {
					this.addJsonExecutionError("上传信息为空");
				}
			} else {
				Setting existed = settingService.find();
				if (existed != null) {
					settingService.update(matchType(existed, this.type, fileName));
				} else {
					settingService.save(matchType(this.setting, this.type, fileName));
				}
			}
		}
		return Action.SUCCESS;
	}

	private Setting matchType(Setting setting, String type, String fileName) {
		if (setting == null) {
			setting = new Setting();
		}
		if ("icon".equals(type)) {
			setting.setIcon(fileName);
		} else if ("logo".equals(type)) {
			setting.setLogo(fileName);
		} else if ("wechat".equals(type)) {
			setting.setWechat(fileName);
		}
		return setting;
	}

	/**
	 * Generate a new file name, prefix with the first letter of its type.
	 * 
	 * @param type
	 * @return
	 */
	private String genFileName(String type) {
		SimpleDateFormat f = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		return type.substring(0, 1) + f.format(new Date()) + ext();
	}

	private String ext() {
		String ext = null;
		if (StringUtils.isNotEmpty(this.uploadObjFileName)) {
			int pos = this.uploadObjFileName.lastIndexOf(".");
			ext = this.uploadObjFileName.substring(pos);
		}
		return ext != null ? ext : StringUtils.EMPTY;
	}

	/**
	 * delete picture(including banner and process)
	 * 
	 * @return
	 */
	public String deletePicture() {
		if (this.picture == null) {
			this.addJsonExecutionError("信息不完整，删除失败");
		} else {
			Picture pic = pictureService.findById(this.picture.getId());
			if (pic != null) {
				pictureService.deleteById(this.picture.getId());
				String parentPath = UploadUtil.getUploadPath(pic.getType());
				File file = new File(parentPath + File.separator + pic.getFileName());
				if (file.exists()) {
					file.delete();
				}
			} else {
				this.addJsonExecutionError("信息已失效，请重新刷新页面");
			}
		}
		return Action.SUCCESS;
	}

	/**
	 * 
	 * @return
	 */
	public String tongleActive() {
		if (this.picture == null) {
			this.addJsonExecutionError("信息不完整，设置失败");
		} else {
			Picture pic = pictureService.findById(this.picture.getId());
			if (pic != null) {
				pic.setInIndex(!pic.isInIndex());
				pictureService.update(pic);
				this.picture = pic;
			} else {
				this.addJsonExecutionError("信息已失效，请重新刷新页面");
			}
		}
		return Action.SUCCESS;
	}

	public SettingService getSettingService() {
		return settingService;
	}

	public void setSettingService(SettingService settingService) {
		this.settingService = settingService;
	}

	public Setting getSetting() {
		return setting;
	}

	public void setSetting(Setting setting) {
		this.setting = setting;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public File getUploadObj() {
		return uploadObj;
	}

	public void setUploadObj(File uploadObj) {
		this.uploadObj = uploadObj;
	}

	public String getUploadObjFileName() {
		return uploadObjFileName;
	}

	public void setUploadObjFileName(String uploadObjFileName) {
		this.uploadObjFileName = uploadObjFileName;
	}

	public PictureService getPictureService() {
		return pictureService;
	}

	public void setPictureService(PictureService pictureService) {
		this.pictureService = pictureService;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public List<Picture> getBanners() {
		return banners;
	}

	public void setBanners(List<Picture> banners) {
		this.banners = banners;
	}

	public List<Picture> getProcess() {
		return process;
	}

	public void setProcess(List<Picture> process) {
		this.process = process;
	}

}
