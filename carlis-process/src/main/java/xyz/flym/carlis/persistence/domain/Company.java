package xyz.flym.carlis.persistence.domain;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Company Info(Entity)
 * 
 * @author Carlis
 * 
 */
public class Company {
	private int id;
	private String name;
	private String keywords;
	private String address;
	private String tel;
	private String cell;
	private String fax;
	private String copyright;
	private String website;
	private String email;
	private String contact;
	private String introduction;
	private String memo;

	public Company() {
	}

	public Company(int id, String name, String keywords, String address, String tel, String cell, String fax,
			String copyright, String website, String email, String contact, String introduction, String memo) {
		this.id = id;
		this.name = name;
		this.keywords = keywords;
		this.address = address;
		this.tel = tel;
		this.cell = cell;
		this.fax = fax;
		this.copyright = copyright;
		this.website = website;
		this.email = email;
		this.contact = contact;
		this.introduction = introduction;
		this.memo = memo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		if(StringUtils.isNotEmpty(introduction)){
			introduction = introduction.replaceAll("\\n", "</br>");
		}
		this.introduction = introduction;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		if (StringUtils.isNotEmpty(keywords)) {
			keywords = keywords.replace("，", ",");
		}
		this.keywords = keywords;
	}

	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
