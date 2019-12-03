package fr.iskills.web.publicapi.genericModel;

public class PaginatedResponse extends Response {
  @NotNull
  private ResponsePage pageInformation;

  public PaginatedResponse(String message, int code, ResponsePage pageInformation) {
    super(message, code);
    this.pageInformation = pageInformation;
  }

  public ResponsePage getPageInformation() {
    return pageInformation;
  }

  public void setPageInformation(ResponsePage pageInformation) {
    this.pageInformation = pageInformation;
  }
}
