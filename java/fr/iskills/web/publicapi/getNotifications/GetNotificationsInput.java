package fr.iskills.web.publicapi.getNotifications;

import fr.iskills.web.publicapi.genericModel.NotNull;
import fr.iskills.web.publicapi.genericModel.Input;

public class GetNotificationsInput extends Input {
  @NotNull
  private GetNotificationsInputData data;

  public GetNotificationsInputData getData() {
    return data;
  }

  public void setData(GetNotificationsInputData data) {
    this.data = data;
  }

  public static class GetNotificationsInputData {
    @NotNull
    private boolean includeAcked;

    public boolean isIncludeAcked() {
      return includeAcked;
    }

    public void setIncludeAcked(boolean includeAcked) {
      this.includeAcked = includeAcked;
    }
  }
}
