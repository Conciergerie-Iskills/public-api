package fr.iskills.web.publicapi;

public class WrongServerResponse extends Response {
  private String data;

  public WrongServerResponse(String message, int code, String targetUrl) {
    super(message, code);
    this.data = targetUrl;
  }

}