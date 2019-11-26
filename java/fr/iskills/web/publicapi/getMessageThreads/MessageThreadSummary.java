package fr.iskills.web.publicapi.getMessageThreads;


import java.util.Date;

public class MessageThreadSummary {
  private String type;
  private int targetId;
  private Date lastMessage;
  private int numberOfMessages;
  private int numberOfUnreadMessages;
  private String lastMessagePreview;
  private String description;

  public MessageThreadSummary(MessageThreadType type, int targetId, Date lastMessage, int numberOfMessages, int numberOfUnreadMessages, String lastMessagePreview, String description) {
    this.type = type.name();
    this.targetId = targetId;
    this.lastMessage = lastMessage;
    this.numberOfMessages = numberOfMessages;
    this.numberOfUnreadMessages = numberOfUnreadMessages;
    this.lastMessagePreview = lastMessagePreview;
    this.description = description;
  }

  public MessageThreadType getType() {
    return MessageThreadType.valueOf(type);
  }

  public void setType(MessageThreadType type) {
    this.type = type.name();
  }

  public int getTargetId() {
    return targetId;
  }

  public void setTargetId(int targetId) {
    this.targetId = targetId;
  }

  public Date getLastMessage() {
    return lastMessage;
  }

  public void setLastMessage(Date lastMessage) {
    this.lastMessage = lastMessage;
  }

  public int getNumberOfMessages() {
    return numberOfMessages;
  }

  public void setNumberOfMessages(int numberOfMessages) {
    this.numberOfMessages = numberOfMessages;
  }

  public int getNumberOfUnreadMessages() {
    return numberOfUnreadMessages;
  }

  public void setNumberOfUnreadMessages(int numberOfUnreadMessages) {
    this.numberOfUnreadMessages = numberOfUnreadMessages;
  }

  public String getLastMessagePreview() {
    return lastMessagePreview;
  }

  public void setLastMessagePreview(String lastMessagePreview) {
    this.lastMessagePreview = lastMessagePreview;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
