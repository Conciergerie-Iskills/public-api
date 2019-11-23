package fr.iskills.web.publicapi.getMessageThreads;

import fr.iskills.web.publicapi.genericModel.ResponsePage;
import fr.iskills.web.publicapi.genericModel.PaginatedResponse;

import java.util.ArrayList;
import java.util.List;

public class GetMessageThreadsResponse extends PaginatedResponse {
  private GetMessageThreadsResponseData data;

  public GetMessageThreadsResponse(String message, int code, ResponsePage pageInformation) {
    super(message, code, pageInformation);
    this.data = new GetMessageThreadsResponseData();
  }

  public void addThread(MessageThreadSummary summary) {
    this.data.threads.add(summary);
  }

  public static class GetMessageThreadsResponseData {
    private List<MessageThreadSummary> threads;

    public GetMessageThreadsResponseData() {
      this.threads = new ArrayList<>();
    }

    public List<MessageThreadSummary> getThreads() {
      return threads;
    }
  }
}
