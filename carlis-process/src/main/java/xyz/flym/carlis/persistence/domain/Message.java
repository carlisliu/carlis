package xyz.flym.carlis.persistence.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Message Info(Entity)
 * 
 * @author Carlis
 * 
 */
public class Message {

	private int id;
	private String content;
	private String messager;
	private String tel;
	private String cell;
	private String email;
	private Date date;
	private String formatedDate;
	private boolean read;

	public Message() {
	}

	public Message(int id, String content, String messager, String tel, String cell, String email, Date date,
			boolean read) {
		this.id = id;
		this.content = content;
		this.messager = messager;
		this.tel = tel;
		this.cell = cell;
		this.email = email;
		this.date = date;
		this.read = read;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMessager() {
		return messager;
	}

	public void setMessager(String messager) {
		this.messager = messager;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
		this.getFormatedDate();
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFormatedDate() {
		if (this.date != null) {
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			this.formatedDate = f.format(this.date);
		}
		return formatedDate;
	}

	public void setFormatedDate(String formatedDate) {
		this.formatedDate = formatedDate;
	}

}
