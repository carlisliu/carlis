package xyz.flym.carlis.persistence.mapper;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Message;

/**
 * 
 * @author Carlis
 * 
 */
public interface MessageMapper {

	/**
	 * find all messages left by users.
	 * 
	 * @return
	 */
	List<Message> findAllMessages();

	/**
	 * 
	 * @param message
	 * @return
	 */
	void saveMessage(Message message);
}
