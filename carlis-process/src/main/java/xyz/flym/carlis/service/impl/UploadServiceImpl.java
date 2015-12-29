package xyz.flym.carlis.service.impl;

import xyz.flym.carlis.persistence.domain.Upload;
import xyz.flym.carlis.persistence.mapper.UploadMapper;
import xyz.flym.carlis.service.UploadService;

/**
 * 
 * @author Carlis
 * 
 */
public class UploadServiceImpl implements UploadService {

	private UploadMapper uploadMapper;

	@Override
	public void saveUpload(Upload upload) {
		uploadMapper.saveUpload(upload);
	}

	@Override
	public void deleteByProductId(int productId) {
		uploadMapper.deleteByProductId(productId);
	}

	@Override
	public void deleteById(int id) {
		uploadMapper.deleteById(id);
	}

	@Override
	public Upload findUploadById(int id) {
		return uploadMapper.findUploadById(id);
	}

	public UploadMapper getUploadMapper() {
		return uploadMapper;
	}

	public void setUploadMapper(UploadMapper uploadMapper) {
		this.uploadMapper = uploadMapper;
	}

}
