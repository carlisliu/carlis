package xyz.flym.carlis.persistence.domain;

/**
 * Category Info(Entity)
 * 
 * @author Carlis
 * 
 */
public class Category {
	private int id;
	private String name;
	private String memo;

	public Category() {
	}

	public Category(int id, String name, String memo) {
		this.id = id;
		this.name = name;
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

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
