package com.betvictor.actionmonitor.service;

import com.betvictor.actionmonitor.model.Message;

public interface ChatService {

    void persist(Message message);

}
