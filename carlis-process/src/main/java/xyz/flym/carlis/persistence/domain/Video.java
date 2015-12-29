package xyz.flym.carlis.persistence.domain;

/**
 * Video Info(Entity)
 * 
 * @author Carlis
 * 
 */
public class Video {

	private int id;
	private String name;
	private String url;
	private boolean inIndex;
	private String embedCode;
	private String memo;

	public Video() {
	}

	public Video(int id, String name, String url, boolean inIndex, String embedCode, String memo) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.inIndex = inIndex;
		this.embedCode = embedCode;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public boolean isInIndex() {
		return inIndex;
	}

	public void setInIndex(boolean inIndex) {
		this.inIndex = inIndex;
	}

	public String getEmbedCode() {
		return embedCode;
	}

	public void setEmbedCode(String embedCode) {
		this.embedCode = embedCode;
	}

}
