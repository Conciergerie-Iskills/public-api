package fr.iskills.web.publicapi.genericModel;

public class WrongServerResponse extends GenericPublicApiResponse {
  private String data;

  public WrongServerResponse(String message, int code, String targetUrl) {
    super(message, code);
    this.data = targetUrl;
  }

}