package xyz.flym.carlis.web.action.admin;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Message;
import xyz.flym.carlis.service.MessageService;

import com.opensymphony.xwork2.Action;

/**
 * 
 * @author Carlis
 * 
 */
public class MessageAction extends SecurityBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MessageService messageService;
	private List<Message> messages;

	/**
	 * 
	 */
	public String execute() {
		messages = messageService.findMessages();
		return Action.SUCCESS;
	}

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

}
