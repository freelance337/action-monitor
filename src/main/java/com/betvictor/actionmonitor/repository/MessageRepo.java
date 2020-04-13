package com.betvictor.actionmonitor.repository;

import com.betvictor.actionmonitor.model.Message;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {

}