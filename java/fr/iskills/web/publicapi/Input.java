package fr.iskills.web.publicapi;


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

  public static class SsoAuth {
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

  public static class Auth {
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
}
