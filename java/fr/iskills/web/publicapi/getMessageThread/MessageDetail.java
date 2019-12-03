package fr.iskills.web.publicapi.getMessageThread;

import fr.iskills.web.publicapi.genericModel.NotNull;

import java.util.Date;

public class MessageDetail {
  @NotNull
  private int id;
  @NotNull
  private String content;
  @NotNull
  private Date date;
  @NotNull
  private boolean fromCurrentUser;
  @NotNull
  private String fromUserDescription;
  @NotNull
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
