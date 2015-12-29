package xyz.flym.carlis.service.impl;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Video;
import xyz.flym.carlis.persistence.mapper.VideoMapper;
import xyz.flym.carlis.service.VideoService;

/**
 * Video Service implementation.
 * 
 * @author Carlis
 * 
 */
public class VideoServiceImpl implements VideoService {

	private VideoMapper videoMapper;

	/**
	 * Find all videos.
	 */
	@Override
	public List<Video> findAllVideos() {
		return videoMapper.findAllVideos();
	}

	/**
	 * Save video info.
	 */
	@Override
	public void saveVideo(Video video) {
		videoMapper.save(video);
	}

	@Override
	public Video findVideoById(int id) {
		return videoMapper.findVideoById(id);
	}

	@Override
	public Video findVideoByName(String name) {
		return videoMapper.findVideoByName(name);
	}

	@Override
	public void updateVideo(Video video) {
		videoMapper.update(video);
	}

	@Override
	public List<Video> findVideosWithLimit(int limit) {
		return videoMapper.findVideosWithLimit(limit);
	}

	@Override
	public void deleteVideo(int id) {
		videoMapper.delete(id);
	}

	public VideoMapper getVideoMapper() {
		return videoMapper;
	}

	public void setVideoMapper(VideoMapper videoMapper) {
		this.videoMapper = videoMapper;
	}

}
