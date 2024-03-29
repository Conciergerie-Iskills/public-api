package fr.iskills.web.publicapi.getNotifications;

import fr.iskills.web.publicapi.genericModel.NotNull;
import fr.iskills.web.publicapi.genericModel.Response;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GetNotificationsResponse extends Response {

  @NotNull
  private List<GetNotificationsResponseNotification> data = new ArrayList<>();

  public GetNotificationsResponse(String message, int code) {
    super(message, code);
  }

  public List<GetNotificationsResponseNotification> getData() {
    return data;
  }

  public void setData(List<GetNotificationsResponseNotification> data) {
    this.data = data;
  }

  public static class GetNotificationsResponseNotification {
    @NotNull
    private int id;
    @NotNull
    private int targetId;
    @NotNull
    private int type;
    @NotNull
    private boolean acknowledged;
    @NotNull
    private String message;
    @NotNull
    private Date date;
    @NotNull
    private String mobileWebLink;
    @NotNull
    private String desktopWebLink;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public int getTargetId() {
      return targetId;
    }

    public void setTargetId(int targetId) {
      this.targetId = targetId;
    }

    public int getType() {
      return type;
    }

    public void setType(int type) {
      this.type = type;
    }

    public boolean isAcknowledged() {
      return acknowledged;
    }

    public void setAcknowledged(boolean acknowledged) {
      this.acknowledged = acknowledged;
    }

    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }

    public Date getDate() {
      return date;
    }

    public void setDate(Date date) {
      this.date = date;
    }

    public String getMobileWebLink() {
      return mobileWebLink;
    }

    public void setMobileWebLink(String mobileWebLink) {
      this.mobileWebLink = mobileWebLink;
    }

    public String getDesktopWebLink() {
      return desktopWebLink;
    }

    public void setDesktopWebLink(String desktopWebLink) {
      this.desktopWebLink = desktopWebLink;
    }
  }
}
