package com.example.alex.MapChat;

/**
 * Created by alex on 09/03/18.
 */

public class IndividualMessage {
    int messageId;
    String messageContent;
    String language;

    public IndividualMessage(int messageId, String messageContent, String language) {
        this.messageId = messageId;
        this.messageContent = messageContent;
        this.language = language;
    }


    public int getMessageId() {
        return messageId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public String getLanguage() {
        return language;
    }
}
