package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.Upload;

/**
 * Upload Mapper
 * 
 * @author Carlis
 * 
 */
public interface UploadMapper {

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
