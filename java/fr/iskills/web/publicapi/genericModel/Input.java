package fr.iskills.web.publicapi.genericModel;


public class Input {
  private String client;
  private Auth auth;

  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public Auth getAuth() {
    return auth;
  }

  public void setAuth(Auth auth) {
    this.auth = auth;
  }
}
