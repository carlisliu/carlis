package xyz.flym.carlis.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import xyz.flym.carlis.persistence.domain.Picture;

/**
 * 
 * @author Carlis
 * 
 */
public interface PictureMapper {

	void save(Picture picture);

	void update(Picture picture);

	List<Picture> findPicturesByType(String type);

	Picture findById(int id);

	void deleteById(int id);

	List<Picture> findPicturesByParams(@Param("picture") Picture picture, @Param("limit") int limit);
}
