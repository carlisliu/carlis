package xyz.flym.carlis.service;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Picture;

/**
 * 
 * @author Carlis
 * 
 */
public interface PictureService {

	void save(Picture picture);

	void update(Picture picture);

	List<Picture> findPicturesByType(String type);

	Picture findById(int id);

	List<Picture> findHomePageBanners(int limit);

	List<Picture> findHomePageProcess(int limit);

	void deleteById(int id);
}
