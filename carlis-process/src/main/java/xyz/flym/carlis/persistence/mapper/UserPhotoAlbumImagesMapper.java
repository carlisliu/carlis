package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.UserPhotoAlbumImages;

public interface UserPhotoAlbumImagesMapper {
    int deleteByPrimaryKey(Long userPhotoAlbumImagesId);

    int insert(UserPhotoAlbumImages record);

    int insertSelective(UserPhotoAlbumImages record);

    UserPhotoAlbumImages selectByPrimaryKey(Long userPhotoAlbumImagesId);

    int updateByPrimaryKeySelective(UserPhotoAlbumImages record);

    int updateByPrimaryKey(UserPhotoAlbumImages record);
}