package fr.iskills.web.publicapi.getMessageThread;

import fr.iskills.web.publicapi.genericModel.InputPage;
import fr.iskills.web.publicapi.genericModel.PaginatedInput;

public class GetMessageThreadInput extends PaginatedInput {
  private GetMessageThreadInputData data;

  public GetMessageThreadInput(InputPage pageData, GetMessageThreadInputData data) {
    super(pageData);
    this.data = data;
  }

  public GetMessageThreadInputData getData() {
    return data;
  }

  public void setData(GetMessageThreadInputData data) {
    this.data = data;
  }

  public static class GetMessageThreadInputData {
    private int targetId;
    private String messageThreadType;

    public GetMessageThreadInputData(int targetId, String messageThreadType) {
      this.targetId = targetId;
      this.messageThreadType = messageThreadType;
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
  }
}
