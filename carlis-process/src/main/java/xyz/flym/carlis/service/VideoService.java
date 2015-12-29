package xyz.flym.carlis.service;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Video;

/**
 * Video Services.
 * 
 * @author Carlis
 * 
 */
public interface VideoService {

	/**
	 * Find all videos.
	 * 
	 * @return
	 */
	List<Video> findAllVideos();

	/**
	 * 
	 * @param limit
	 * @return
	 */
	List<Video> findVideosWithLimit(int limit);

	/**
	 * Find specified video by its id.
	 * 
	 * @param id
	 * @return
	 */
	Video findVideoById(int id);

	/**
	 * Find specified video by its name.
	 * 
	 * @param name
	 * @return
	 */
	Video findVideoByName(String name);

	/**
	 * Save video info.
	 * 
	 * @param video
	 */
	void saveVideo(Video video);

	/**
	 * Update video info.
	 * 
	 * @param video
	 */
	void updateVideo(Video video);

	/**
	 * 
	 * @param id
	 */
	void deleteVideo(int id);
}
