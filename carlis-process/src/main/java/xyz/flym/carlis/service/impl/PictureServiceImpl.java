package xyz.flym.carlis.service.impl;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Picture;
import xyz.flym.carlis.persistence.mapper.PictureMapper;
import xyz.flym.carlis.service.PictureService;

/**
 * 
 * @author Carlis
 * 
 */
public class PictureServiceImpl implements PictureService {

	private PictureMapper pictureMapper;

	@Override
	public void save(Picture picture) {
		pictureMapper.save(picture);
	}

	@Override
	public void update(Picture picture) {
		pictureMapper.update(picture);
	}

	@Override
	public List<Picture> findPicturesByType(String type) {
		return pictureMapper.findPicturesByType(type);
	}

	@Override
	public Picture findById(int id) {
		return pictureMapper.findById(id);
	}

	@Override
	public void deleteById(int id) {
		pictureMapper.deleteById(id);
	}

	@Override
	public List<Picture> findHomePageBanners(int limit) {
		Picture picture = new Picture();
		picture.setInIndex(true);
		picture.setType("banner");
		return pictureMapper.findPicturesByParams(picture, limit);
	}

	@Override
	public List<Picture> findHomePageProcess(int limit) {
		Picture picture = new Picture();
		picture.setInIndex(true);
		picture.setType("process");
		return pictureMapper.findPicturesByParams(picture, limit);
	}

	public PictureMapper getPictureMapper() {
		return pictureMapper;
	}

	public void setPictureMapper(PictureMapper pictureMapper) {
		this.pictureMapper = pictureMapper;
	}

}
