package xyz.flym.carlis.web.action;

import org.apache.commons.lang3.StringUtils;

import xyz.flym.carlis.persistence.domain.Message;
import xyz.flym.carlis.service.MessageService;

import com.opensymphony.xwork2.Action;

/**
 * 
 * @author Carlis
 * 
 */
public class MessageAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Message message;
	private MessageService messageService;

	/**
	 * Save customer's message.
	 * 
	 * @return
	 */
	public String execute() {
		if (this.validateMessage()) {
			messageService.saveMessage(this.message);
		} else {
			this.addJsonExecutionError("信息不完整");
		}
		return Action.SUCCESS;
	}

	/**
	 * Messager and message's content can not be empty, also at least one
	 * contact info needs to be provided.
	 * 
	 * @return
	 */
	private boolean validateMessage() {
		return this.message != null
				&& StringUtils.isNotEmpty(this.message.getContent())
				&& StringUtils.isNotEmpty(this.message.getMessager())
				&& (StringUtils.isNotEmpty(this.message.getCell()) || StringUtils.isNotEmpty(this.message.getEmail()) || StringUtils
						.isNotEmpty(this.message.getTel()));
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
}
