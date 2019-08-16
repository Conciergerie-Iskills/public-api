package fr.iskills.web.publicapi.getOrders;

import fr.iskills.web.publicapi.Input;

public class GetOrdersInput extends Input {
  private GetOrdersInputData data;

  public GetOrdersInputData getData() {
    return data;
  }

  public static class GetOrdersInputData {
    private boolean includeInactive;

    public boolean isIncludeInactive() {
      return includeInactive;
    }

    public void setIncludeInactive(boolean includeInactive) {
      this.includeInactive = includeInactive;
    }
  }
}
