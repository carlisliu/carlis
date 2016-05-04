package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.UserPhotoAlbum;

public interface UserPhotoAlbumMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(UserPhotoAlbum record);

    int insertSelective(UserPhotoAlbum record);

    UserPhotoAlbum selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(UserPhotoAlbum record);

    int updateByPrimaryKey(UserPhotoAlbum record);
}