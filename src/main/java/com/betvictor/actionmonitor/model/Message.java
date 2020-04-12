package com.betvictor.actionmonitor.model;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.Id;
// import javax.persistence.Table;

// @Entity
// @Table(name = "messages", schema = "message")
public class Message {

    // @Id
    // @GeneratedValue
    // @Column(name = "message_id")
    // private Long id;

    // @Column(name = "user")
    private String user;

    // @Column(name = "content")
    private String content;

    private MessageType type;

    // public Message() {
    // }

    // public Message(Long id, String user, String content, MessageType type) {
    // this.user = user;
    // this.content = content;
    // this.type = type;
    // }

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