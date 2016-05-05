package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.UserPhotoAlbum;

public interface UserPhotoAlbumMapper {
    int deleteByPrimaryKey(Long userPhotoAlbumId);

    int insert(UserPhotoAlbum record);

    int insertSelective(UserPhotoAlbum record);

    UserPhotoAlbum selectByPrimaryKey(Long userPhotoAlbumId);

    int updateByPrimaryKeySelective(UserPhotoAlbum record);

    int updateByPrimaryKey(UserPhotoAlbum record);
}