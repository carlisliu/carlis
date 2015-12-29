package xyz.flym.carlis.service;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Message;

/**
 * 
 * @author Carlis
 * 
 */
public interface MessageService {

	/**
	 * 
	 * @return
	 */
	List<Message> findMessages();

	/**
	 * 
	 * @param message
	 */
	void saveMessage(Message message);
}
