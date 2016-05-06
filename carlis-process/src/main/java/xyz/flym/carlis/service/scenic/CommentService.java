package xyz.flym.carlis.service.scenic;

import java.util.List;

import xyz.flym.carlis.persistence.domain.ScenicSpotComments;

/**
 * 
 * @author Carlis
 *
 */
public interface CommentService {

	/**
	 * 按评论级别查找评论
	 * 
	 * @param level
	 * @return
	 */
	List<ScenicSpotComments> findCommentsByLevel(int level);
}
