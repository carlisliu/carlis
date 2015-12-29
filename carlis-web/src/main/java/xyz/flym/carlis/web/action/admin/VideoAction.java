package xyz.flym.carlis.web.action.admin;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import xyz.flym.carlis.persistence.domain.Video;
import xyz.flym.carlis.service.VideoService;

import com.opensymphony.xwork2.Action;

/**
 * Video Action.
 * 
 * @author Carlis
 * 
 */
public class VideoAction extends SecurityBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Video video;
	private List<Video> videos;
	private VideoService videoService;
	private int id;

	/**
	 * 
	 * @return
	 */
	public String init() {
		this.videos = this.videoService.findAllVideos();
		return Action.SUCCESS;
	}

	/**
	 * Save video info.
	 * 
	 * @return
	 */
	public String save() {
		if (this.validVideo()) {
			Video existed = videoService.findVideoByName(video.getName());
			if (existed != null) {
				this.addJsonExecutionError("该视频已存在，请重新命名");
			} else {
				videoService.saveVideo(video);
				this.video = videoService.findVideoByName(video.getName());
			}
		} else {
			this.addJsonExecutionError("视频信息为空");
		}
		return Action.SUCCESS;
	}

	/**
	 * Update
	 * 
	 * @return
	 */
	public String update() {
		if (this.validVideo()) {
			Video existed = this.videoService.findVideoById(this.video.getId());
			if (existed != null) {
				this.videoService.updateVideo(video);
			} else {
				this.addJsonExecutionError("视频信息不存在");
			}
		} else {
			this.addJsonExecutionError("视频信息为空");
		}
		return Action.SUCCESS;
	}

	/**
	 * 
	 * @return
	 */
	public String tongleActive() {
		if (this.video != null) {
			Video existed = videoService.findVideoById(this.video.getId());
			if (existed != null) {
				existed.setInIndex(this.video.isInIndex());
				videoService.updateVideo(existed);
			} else {
				this.addJsonExecutionError("视频信息不存在");
			}
		} else {
			this.addJsonExecutionError("视频信息为空");
		}
		return Action.SUCCESS;
	}

	/**
	 * Validate video info.
	 * 
	 * @return
	 */
	public boolean validVideo() {
		return this.video != null && StringUtils.isNotEmpty(this.video.getName())
				&& StringUtils.isNotEmpty(this.video.getUrl());
	}

	/**
	 * Delete specified video info.
	 * 
	 * @return
	 */
	public String deleteVideo() {
		if (this.id != 0) {
			videoService.deleteVideo(this.id);
		} else {
			this.addJsonExecutionError("请选择需要删除的视频");
		}
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

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
