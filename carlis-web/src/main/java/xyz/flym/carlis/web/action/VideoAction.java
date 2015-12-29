package xyz.flym.carlis.web.action;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Video;
import xyz.flym.carlis.service.VideoService;

import com.opensymphony.xwork2.Action;

/**
 * 
 * @author Carlis
 * 
 */
public class VideoAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Video> videos;
	private VideoService videoService;

	/**
	 * 
	 */
	public String execute() {
		this.videos = videoService.findAllVideos();
		return Action.SUCCESS;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public VideoService getVideoService() {
		return videoService;
	}

	public void setVideoService(VideoService videoService) {
		this.videoService = videoService;
	}

}
