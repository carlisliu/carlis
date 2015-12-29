package xyz.flym.carlis.service;

import xyz.flym.carlis.persistence.domain.Upload;

/**
 * Upload Service
 * 
 * @author Carlis
 * 
 */
public interface UploadService {

	/**
	 * add upload record.
	 * 
	 * @param upload
	 */
	void saveUpload(Upload upload);

	/**
	 * delete upload records by product id.
	 * 
	 * @param productId
	 */
	void deleteByProductId(int productId);

	/**
	 * delete upload record by id.
	 * 
	 * @param id
	 */
	void deleteById(int id);

	/**
	 * 
	 * @param id
	 * @return
	 */
	Upload findUploadById(int id);
}
