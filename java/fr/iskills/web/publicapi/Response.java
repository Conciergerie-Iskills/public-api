package fr.iskills.web.publicapi;


public class Response {
  private String message;
  private int code;
  private int notifications;
  private long generatedTime;

  public Response(String message, int code) {
    this.message = message;
    this.code = code;
    generatedTime = System.currentTimeMillis();
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public int getNotifications() {
    return notifications;
  }

  public void setNotifications(int notifications) {
    this.notifications = notifications;
  }

  public long getGeneratedTime() {
    return generatedTime;
  }

  public void setGeneratedTime(long generatedTime) {
    this.generatedTime = generatedTime;
  }
}
