package xyz.flym.carlis.web.action.admin.scenic;

import java.util.List;

import com.opensymphony.xwork2.Action;

import xyz.flym.carlis.persistence.domain.ScenicSpotComments;
import xyz.flym.carlis.service.scenic.CommentService;
import xyz.flym.carlis.web.action.admin.SecurityBaseAction;
import xyz.flym.carlis.web.action.consts.Comment;

/**
 * 
 * @author Carlis
 *
 */
public class CommentAction extends SecurityBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CommentService commentService;
	private List<ScenicSpotComments> comments;

	/**
	 * 评论类型（0为差评；1为好评；2为一般）
	 */
	private int level = -1;

	public String execute() {
		if (Comment.valueOf(this.level) == null) {
			// avoid search parameter is null;
			this.level = -1;
		}
		this.comments = commentService.findCommentsByLevel(this.level);
		return Action.SUCCESS;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public CommentService getCommentService() {
		return commentService;
	}

	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

	public List<ScenicSpotComments> getComments() {
		return comments;
	}

	public void setComments(List<ScenicSpotComments> comments) {
		this.comments = comments;
	}

}
