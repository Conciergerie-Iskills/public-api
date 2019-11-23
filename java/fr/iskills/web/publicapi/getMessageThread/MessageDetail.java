package fr.iskills.web.publicapi.getMessageThread;


import java.util.Date;

public class MessageDetail {
  private int id;
  private String content;
  private Date date;
  private boolean fromCurrentUser;
  private String fromUserDescription;
  private boolean acknowledged;

  public MessageDetail(int id, String content, Date date, boolean fromCurrentUser, String fromUserDescription, boolean acknowledged) {
    this.id = id;
    this.content = content;
    this.date = date;
    this.fromCurrentUser = fromCurrentUser;
    this.fromUserDescription = fromUserDescription;
    this.acknowledged = acknowledged;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public boolean isFromCurrentUser() {
    return fromCurrentUser;
  }

  public void setFromCurrentUser(boolean fromCurrentUser) {
    this.fromCurrentUser = fromCurrentUser;
  }

  public String getFromUserDescription() {
    return fromUserDescription;
  }

  public void setFromUserDescription(String fromUserDescription) {
    this.fromUserDescription = fromUserDescription;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean isAcknowledged() {
    return acknowledged;
  }

  public void setAcknowledged(boolean acknowledged) {
    this.acknowledged = acknowledged;
  }
}
