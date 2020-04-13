package com.betvictor.actionmonitor.controller;

import com.betvictor.actionmonitor.model.Message;
import com.betvictor.actionmonitor.service.ChatService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    private static final Logger logger = LoggerFactory.getLogger(ChatController.class);

    @Autowired
    ChatService service;

    @MessageMapping("/chat.register")
    @SendTo("/topic/public")
    public Message register(@Payload Message chatMessage, SimpMessageHeaderAccessor headerAccessor) {

        logger.info("******************************* New chat participant *******************************");
        logger.debug("User logged in: {}", chatMessage.getUserName());

        headerAccessor.getSessionAttributes().put("username", chatMessage.getUserName());

        logger.info("******************************* Printing message in chatboard *******************************");
        return chatMessage;
    }

    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public Message sendMessage(@Payload Message chatMessage) {

        logger.info("******************************* New chat received *******************************");
        logger.debug("Message: {}, content: {}", chatMessage.getUserName(), chatMessage.getContent());

        service.persist(chatMessage);

        logger.info("******************************* Printing message in chatboard *******************************");
        return chatMessage;
    }

}