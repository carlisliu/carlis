package xyz.flym.carlis.service.impl;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Message;
import xyz.flym.carlis.persistence.mapper.MessageMapper;
import xyz.flym.carlis.service.MessageService;

/**
 * 
 * @author Carlis
 * 
 */
public class MessageServiceImpl implements MessageService {

	private MessageMapper messageMapper;

	/**
	 * Find all messages, order by `read` flag. Unread first.
	 */
	@Override
	public List<Message> findMessages() {
		return messageMapper.findAllMessages();
	}

	/**
	 * 
	 */
	@Override
	public void saveMessage(Message message) {
		messageMapper.saveMessage(message);
	}

	public MessageMapper getMessageMapper() {
		return messageMapper;
	}

	public void setMessageMapper(MessageMapper messageMapper) {
		this.messageMapper = messageMapper;
	}

}
