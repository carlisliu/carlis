package xyz.flym.carlis.web.action.admin.scenic;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.Action;

import xyz.flym.carlis.persistence.domain.BaseAdminScenicSoptRela;
import xyz.flym.carlis.persistence.domain.ScenicSpot;
import xyz.flym.carlis.persistence.domain.ScenicSpotExtend;
import xyz.flym.carlis.persistence.domain.UserContext;
import xyz.flym.carlis.service.scenic.IntroductionService;
import xyz.flym.carlis.utils.security.LoginContextHolder;
import xyz.flym.carlis.web.action.admin.SecurityBaseAction;

/**
 * 
 * @author Carlis
 *
 */
public class IntroductionAction extends SecurityBaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IntroductionService introductionService;
	private ScenicSpot scenicSpot;
	private int spotId = -1;
	private boolean scenicBasicInfo = false;
	private boolean scenicSpotInfo = true;
	private boolean scenicHistory = false;
	private boolean scenicPlayTime = false;

	public String execute() {
		if (this.spotId == -1) {
			// 从当前用户信息中获取用户管辖的景点ID
			UserContext userContext = LoginContextHolder.getUserContext();
			List<BaseAdminScenicSoptRela> scenicSpots = userContext.getBaseAdminuserinfo().getScenicSports();
			if (scenicSpots == null || scenicSpots.isEmpty()) {
				return Action.INPUT;
			}
			this.spotId = scenicSpots.get(0).getScenicSpotId();
		}
		this.scenicSpot = introductionService.findScenicSpotById(this.spotId);
		checkPublishStatus();
		return Action.SUCCESS;
	}

	private void checkPublishStatus() {
		if (this.scenicSpot != null) {
			// 景点基本信息验证
			if (this.scenicSpot.getRegionId() != -1 && StringUtils.isNotEmpty(this.scenicSpot.getName())
					&& StringUtils.isNotEmpty(this.scenicSpot.getNameEn())
					&& StringUtils.isNotEmpty(this.scenicSpot.getSlogan())
			/* && StringUtils.isNotEmpty(this.scenicSpot.getTags()) */) {
				this.scenicBasicInfo = true;
			}
			// 景点介绍验证
			if (this.scenicSpot.getScenicSportExtends() != null && !this.scenicSpot.getScenicSportExtends().isEmpty()) {
				for (ScenicSpotExtend scenidSpotExtend : this.scenicSpot.getScenicSportExtends()) {
					if (StringUtils.isEmpty(scenidSpotExtend.getDescription())
							|| StringUtils.isEmpty(scenidSpotExtend.getImgPath())) {
						this.scenicSpotInfo = false;
						break;
					}
				}
			}
			// 人文历史验证
			if (StringUtils.isNotEmpty(this.scenicSpot.getHistory())
					&& StringUtils.isNotEmpty(this.scenicSpot.getHisThumbnailPath())) {
				this.scenicHistory = true;
			}
			// 游玩时间
			if (this.scenicSpot.getStartTime1() > 0 && this.scenicSpot.getEndTime1() > 0
					&& this.scenicSpot.getStartTime2() > 0 && this.scenicSpot.getEndTime2() > 0) {
				this.scenicPlayTime = true;
			}
		}
	}

	/**
	 * 更新发布状态
	 * 
	 * @return
	 */
	public String publish() {
		if (this.scenicSpot != null) {
			ScenicSpot found = introductionService.findScenicSpotById(this.scenicSpot.getScenicSpotId());
			if (found != null) {
				if (found.getStatus() == this.scenicSpot.getStatus()) {
					this.addJsonExecutionError("状态已更新");
				} else {
					introductionService.updateSelective(this.scenicSpot);
				}
			}
		} else {
			this.addJsonExecutionError("该景点信息不存在或已被其他管理人员删除");
		}
		return Action.SUCCESS;
	}

	/**
	 * 
	 * @return
	 */
	public String save() {
		if (this.scenicSpot != null) {
			ScenicSpot found = introductionService.findScenicSpotById(this.scenicSpot.getScenicSpotId());
			if (found != null) {
				introductionService.updateSelective(this.scenicSpot);
				return Action.SUCCESS;
			}
		}
		this.addJsonExecutionError("该景点信息不存在或已被其他管理人员删除");
		return Action.SUCCESS;
	}

	public IntroductionService getIntroductionService() {
		return introductionService;
	}

	public void setIntroductionService(IntroductionService introductionService) {
		this.introductionService = introductionService;
	}

	public ScenicSpot getScenicSpot() {
		return scenicSpot;
	}

	public void setScenicSpot(ScenicSpot scenicSpot) {
		this.scenicSpot = scenicSpot;
	}

	public int getSpotId() {
		return spotId;
	}

	public void setSpotId(int spotId) {
		this.spotId = spotId;
	}

	public boolean isScenicBasicInfo() {
		return scenicBasicInfo;
	}

	public void setScenicBasicInfo(boolean scenicBasicInfo) {
		this.scenicBasicInfo = scenicBasicInfo;
	}

	public boolean isScenicSpotInfo() {
		return scenicSpotInfo;
	}

	public void setScenicSpotInfo(boolean scenicSpotInfo) {
		this.scenicSpotInfo = scenicSpotInfo;
	}

	public boolean isScenicHistory() {
		return scenicHistory;
	}

	public void setScenicHistory(boolean scenicHistory) {
		this.scenicHistory = scenicHistory;
	}

	public boolean isScenicPlayTime() {
		return scenicPlayTime;
	}

	public void setScenicPlayTime(boolean scenicPlayTime) {
		this.scenicPlayTime = scenicPlayTime;
	}

}
