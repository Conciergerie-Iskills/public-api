package fr.iskills.web.publicapi.genericModel;

@JavaScriptType
public class PaginatedResponse extends GenericPublicApiResponse {
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
