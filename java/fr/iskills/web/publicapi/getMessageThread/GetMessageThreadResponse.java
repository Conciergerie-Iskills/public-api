package fr.iskills.web.publicapi.getMessageThread;

import fr.iskills.web.publicapi.genericModel.ResponsePage;
import fr.iskills.web.publicapi.genericModel.PaginatedResponse;

public class GetMessageThreadResponse extends PaginatedResponse {
  private MessageThread data;

  public GetMessageThreadResponse(String message, int code, ResponsePage pageInformation, MessageThread data) {
    super(message, code, pageInformation);
    this.data = data;
  }

  public MessageThread getData() {
    return data;
  }

  public void setData(MessageThread data) {
    this.data = data;
  }
}
