package xyz.flym.carlis.persistence.domain;

/**
 * 
 * @author Carlis
 * 
 */
public class Picture {
	private int id;
	private String type;
	private String fileName;
	private boolean inIndex;

	public Picture() {
	}

	public Picture(int id, String type, String fileName, boolean inIndex) {
		this.id = id;
		this.type = type;
		this.fileName = fileName;
		this.inIndex = inIndex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public boolean isInIndex() {
		return inIndex;
	}

	public void setInIndex(boolean inIndex) {
		this.inIndex = inIndex;
	}

}
