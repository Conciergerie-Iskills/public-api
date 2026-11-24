package fr.iskills.web.publicapi.ackNotifications;

import fr.iskills.web.publicapi.genericModel.JavaScriptType;
import fr.iskills.web.publicapi.genericModel.NotNull;
import fr.iskills.web.publicapi.genericModel.Input;

import java.util.ArrayList;
import java.util.List;

@JavaScriptType
public class AckNotificationsInput extends Input {
  @NotNull
  private AckNotificationsInputData data = new AckNotificationsInputData();

  public AckNotificationsInputData getData() {
    return data;
  }

  public static class AckNotificationsInputData {
    @NotNull
    private List<Long> notificationIds = new ArrayList<>();
    private boolean unread;
    public void add(Long i) {
      notificationIds.add(i);
    }

    public List<Long> getNotificationIds() {
      return notificationIds;
    }

    public boolean isUnread() {
      return unread;
    }

    public void setUnread(boolean unread) {
      this.unread = unread;
    }
  }
}
