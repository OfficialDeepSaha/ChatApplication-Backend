package com.message.api;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
	
	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;
	
	
	@MessageMapping("/message")
	@SendTo("/chatroom/public")
	public Message sendMessageToChatRoom(@Payload Message message) {
		message.setDate(LocalDate.now());
		
		return message;
		
	}
	
	
	@MessageMapping("/private-message")
	public Message sendMessageToPrivateUser(@Payload Message message) {
		
		simpMessagingTemplate.convertAndSendToUser(message.getReceiverName(), "/private", message);
		message.setDate(LocalDate.now());
		
		return message;
		
	}

}
