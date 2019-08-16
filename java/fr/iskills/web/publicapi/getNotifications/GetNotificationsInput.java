package fr.iskills.web.publicapi.getNotifications;

import fr.iskills.web.publicapi.Input;

public class GetNotificationsInput extends Input {
  private GetNotificationsInputData data;

  public GetNotificationsInputData getData() {
    return data;
  }

  public void setData(GetNotificationsInputData data) {
    this.data = data;
  }

  public static class GetNotificationsInputData {
    private boolean includeAcked;

    public boolean isIncludeAcked() {
      return includeAcked;
    }

    public void setIncludeAcked(boolean includeAcked) {
      this.includeAcked = includeAcked;
    }
  }
}
