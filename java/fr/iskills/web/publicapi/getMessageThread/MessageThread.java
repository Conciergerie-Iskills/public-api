package fr.iskills.web.publicapi.getMessageThread;


import java.util.ArrayList;
import java.util.List;

public class MessageThread {
  private List<MessageDetail> elements = new ArrayList<>();
  private int targetId;
  private String messageThreadType;
  private String description;

  public MessageThread(int targetId, String messageThreadType, String description) {
    this.targetId = targetId;
    this.messageThreadType = messageThreadType;
    this.description = description;
  }

  public void addMessage(MessageDetail msg) {
    elements.add(msg);
  }

  public List<MessageDetail> getElements() {
    return elements;
  }

  public void setElements(List<MessageDetail> elements) {
    this.elements = elements;
  }

  public int getTargetId() {
    return targetId;
  }

  public void setTargetId(int targetId) {
    this.targetId = targetId;
  }

  public String getMessageThreadType() {
    return messageThreadType;
  }

  public void setMessageThreadType(String messageThreadType) {
    this.messageThreadType = messageThreadType;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}