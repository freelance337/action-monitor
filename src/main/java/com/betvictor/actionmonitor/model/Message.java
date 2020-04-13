package com.betvictor.actionmonitor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String content;
    private MessageType type;

    public enum MessageType {
        CHAT, LEAVE, JOIN
    }

    public Message() {

    }

    public Message(String userName, String content, MessageType type) {
        this.userName = userName;
        this.content = content;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Message [content=" + content + ", id=" + id + ", type=" + type + ", user=" + userName + "]";
    }

}