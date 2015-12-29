package xyz.flym.carlis.persistence.mapper;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Video;

/**
 * 
 * @author Carlis
 * 
 */
public interface VideoMapper {

	/**
	 * 
	 * @return
	 */
	List<Video> findAllVideos();

	/**
	 * Save video
	 * 
	 * @param video
	 */
	void save(Video video);

	/**
	 * Update video.
	 * 
	 * @param video
	 */
	void update(Video video);

	/**
	 * Find video by its id.
	 * 
	 * @param id
	 * @return
	 */
	Video findVideoById(int id);

	/**
	 * Find video by its name.
	 * 
	 * @param name
	 * @return
	 */
	Video findVideoByName(String name);

	/**
	 * 
	 * @param limit
	 * @return
	 */
	List<Video> findVideosWithLimit(int limit);
	
	/**
	 * 
	 * @param id
	 */
	void delete(int id);
}
