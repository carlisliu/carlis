package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.UserPhotoAlbumImages;

public interface UserPhotoAlbumImagesMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(UserPhotoAlbumImages record);

    int insertSelective(UserPhotoAlbumImages record);

    UserPhotoAlbumImages selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(UserPhotoAlbumImages record);

    int updateByPrimaryKey(UserPhotoAlbumImages record);
}