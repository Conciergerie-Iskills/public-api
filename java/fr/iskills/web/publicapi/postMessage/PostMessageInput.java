package fr.iskills.web.publicapi.postMessage;

import fr.iskills.web.publicapi.genericModel.Input;
import fr.iskills.web.publicapi.genericModel.InputPage;
import fr.iskills.web.publicapi.genericModel.NotNull;
import fr.iskills.web.publicapi.genericModel.PaginatedInput;
import fr.iskills.web.publicapi.getMessageThreads.MessageThreadType;

public class PostMessageInput extends PaginatedInput {
  private PostMessageInputData data;

  public PostMessageInput(InputPage pageData, PostMessageInputData data) {
    super(pageData);
    this.data = data;
  }

  public PostMessageInputData getData() {
    return data;
  }

  public void setData(PostMessageInputData data) {
    this.data = data;
  }

  public static class PostMessageInputData {
    @NotNull
    private int targetId;
    @NotNull
    private String messageThreadType;
    @NotNull
    private String messageBody;

    public PostMessageInputData(int targetId, String messageThreadType, String messageBody) {
      this.targetId = targetId;
      this.messageThreadType = messageThreadType;
      this.messageBody = messageBody;
    }

    public int getTargetId() {
      return targetId;
    }

    public void setTargetId(int targetId) {
      this.targetId = targetId;
    }

    public MessageThreadType getMessageThreadType() {
      return MessageThreadType.valueOf(messageThreadType);
    }

    public void setMessageThreadType(MessageThreadType type) {
      this.messageThreadType = type.name();
    }

    public String getMessageBody() {
      return messageBody;
    }

    public void setMessageBody(String messageBody) {
      this.messageBody = messageBody;
    }
  }
}
