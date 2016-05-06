package xyz.flym.carlis.service.scenic.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import xyz.flym.carlis.persistence.domain.ScenicSpotComments;
import xyz.flym.carlis.persistence.domain.UserContext;
import xyz.flym.carlis.persistence.mapper.ScenicSpotCommentsMapper;
import xyz.flym.carlis.service.scenic.CommentService;
import xyz.flym.carlis.utils.UtilHelper;
import xyz.flym.carlis.utils.security.LoginContextHolder;

public class CommentServiceImpl implements CommentService {

	private static final Log LOG = LogFactory.getLog(CommentServiceImpl.class);
	private ScenicSpotCommentsMapper scenicSpotCommentsMapper;

	/**
	 * 按评论级别查找评论
	 */
	@Override
	public List<ScenicSpotComments> findCommentsByLevel(int level) {
		ScenicSpotComments comment = new ScenicSpotComments();
		comment.setType(level);
		UserContext userContext = LoginContextHolder.getUserContext();
		if (userContext == null || userContext.getBaseAdminuserinfo() == null
				|| userContext.getBaseAdminuserinfo().getScenicSports() == null) {
			LOG.debug("User context is empty");
			return UtilHelper.emptyList();
		}
		// comment.setScenicSpotId(userContext.getBaseUserScenicspot().getScenicSpotId());
		return scenicSpotCommentsMapper.findBy(comment);
	}

	public ScenicSpotCommentsMapper getScenicSpotCommentsMapper() {
		return scenicSpotCommentsMapper;
	}

	public void setScenicSpotCommentsMapper(ScenicSpotCommentsMapper scenicSpotCommentsMapper) {
		this.scenicSpotCommentsMapper = scenicSpotCommentsMapper;
	}

}
