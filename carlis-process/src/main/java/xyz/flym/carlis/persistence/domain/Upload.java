package xyz.flym.carlis.persistence.domain;

/**
 * Uploaded product filename.
 * 
 * @author Carlis
 * 
 */
public class Upload {
	private int id;
	private int productId;
	private String fileName;
	private String originalFileName;

	public Upload() {
	}

	public Upload(int productId, String fileName, String originalFileName) {
		this.productId = productId;
		this.fileName = fileName;
		this.originalFileName = originalFileName;
	}

	public Upload(int id, int productId, String fileName, String originalFileName) {
		this.id = id;
		this.productId = productId;
		this.fileName = fileName;
		this.originalFileName = originalFileName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getOriginalFileName() {
		return originalFileName;
	}

	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}

}
