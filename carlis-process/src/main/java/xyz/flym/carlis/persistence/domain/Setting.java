package xyz.flym.carlis.persistence.domain;

/**
 * 
 * @author Carlis
 * 
 */
public class Setting {
	private int id;
	private String logo;
	private String icon;
	private String wechat;
	private int bannerNum;
	private int processNum;
	private String qq;

	public Setting() {
	}

	public Setting(int id, String logo, String icon, String wechat, int bannerNum, int processNum, String qq) {
		this.id = id;
		this.logo = logo;
		this.icon = icon;
		this.wechat = wechat;
		this.bannerNum = bannerNum;
		this.processNum = processNum;
		this.qq = qq;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public int getBannerNum() {
		return bannerNum;
	}

	public void setBannerNum(int bannerNum) {
		this.bannerNum = bannerNum;
	}

	public int getProcessNum() {
		return processNum;
	}

	public void setProcessNum(int processNum) {
		this.processNum = processNum;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

}
