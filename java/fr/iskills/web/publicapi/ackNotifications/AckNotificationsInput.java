package fr.iskills.web.publicapi.ackNotifications;

import fr.iskills.web.publicapi.genericModel.NotNull;
import fr.iskills.web.publicapi.genericModel.Input;

import java.util.ArrayList;
import java.util.List;

public class AckNotificationsInput extends Input {
  @NotNull
  private AckNotificationsInputData data = new AckNotificationsInputData();

  public AckNotificationsInputData getData() {
    return data;
  }

  public static class AckNotificationsInputData {
    @NotNull
    private List<Integer> notificationIds = new ArrayList<>();
    public void add(Integer i) {
      notificationIds.add(i);
    }

    public List<Integer> getNotificationIds() {
      return notificationIds;
    }
  }
}
