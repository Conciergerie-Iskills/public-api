package fr.iskills.web.publicapi.genericModel;


public class SsoAuth {
  private String clientId;
  private String ssoToken;

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public String getSsoToken() {
    return ssoToken;
  }

  public void setSsoToken(String ssoToken) {
    this.ssoToken = ssoToken;
  }
}