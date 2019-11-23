package fr.iskills.web.publicapi.genericModel;

public class Auth {
  private String sessionId;
  private SsoAuth ssoToken;

  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public SsoAuth getSsoToken() {
    return ssoToken;
  }

  public void setSsoToken(SsoAuth ssoToken) {
    this.ssoToken = ssoToken;
  }
}
