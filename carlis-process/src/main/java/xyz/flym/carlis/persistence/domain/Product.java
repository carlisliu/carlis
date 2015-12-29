package xyz.flym.carlis.persistence.domain;

import java.util.List;

/**
 * Product Info(Entity)
 * 
 * @author Carlis
 * 
 */
public class Product {

	private int id;
	private String name;
	private Category category;
	private String description;
	private String parameters;
	private String memo;
	private boolean core;
	private boolean hot;
	private String cover;
	private List<Upload> uploads;

	public Product() {
	}

	public Product(int id, String name, Category category, String description, String parameters, boolean core,
			boolean hot, String memo, String cover) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
		this.parameters = parameters;
		this.core = core;
		this.hot = hot;
		this.memo = memo;
		this.cover = cover;
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

	public List<Upload> getUploads() {
		return uploads;
	}

	public void setUploads(List<Upload> uploads) {
		this.uploads = uploads;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public boolean isCore() {
		return core;
	}

	public void setCore(boolean core) {
		this.core = core;
	}

	public boolean isHot() {
		return hot;
	}

	public void setHot(boolean hot) {
		this.hot = hot;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

}
