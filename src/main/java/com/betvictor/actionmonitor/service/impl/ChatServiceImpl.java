package com.betvictor.actionmonitor.service.impl;

import com.betvictor.actionmonitor.model.Message;
import com.betvictor.actionmonitor.repository.MessageRepo;
import com.betvictor.actionmonitor.service.ChatService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    private static final Logger logger = LoggerFactory.getLogger(ChatServiceImpl.class);

    @Autowired
    MessageRepo repo;

    @Override
    public void persist(Message message) {

        logger.info("******************************* Persisting message into database *******************************");
        logger.debug("Message -  user name: {}, content: {}, type: {} ", message.getUserName(), message.getContent(),
                message.getType());

        repo.save(message);

        logger.info("******************************* Message Saved Successfuly! *******************************");

    }

}