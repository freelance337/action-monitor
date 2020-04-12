package com.betvictor.actionmonitor.model;

public class Message {

    private String user;

    private String content;

    private MessageType type;

    public enum MessageType {
        CHAT, LEAVE, JOIN
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}