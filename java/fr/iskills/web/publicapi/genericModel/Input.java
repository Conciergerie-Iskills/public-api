package fr.iskills.web.publicapi.genericModel;

public class Input {
  @NotNull
  private String client;
  @NotNull
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
