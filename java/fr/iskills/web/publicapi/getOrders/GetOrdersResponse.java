package fr.iskills.web.publicapi.getOrders;

import fr.iskills.web.publicapi.Response;

import java.util.*;

public class GetOrdersResponse extends Response {
  private GetOrdersResponseData data = new GetOrdersResponseData();

  public GetOrdersResponse(String message, int code) {
    super(message, code);
  }

  public GetOrdersResponseData getData() {
    return data;
  }

  public void setData(GetOrdersResponseData data) {
    this.data = data;
  }

  public static class GetOrdersResponseData {
    List<GetOrdersResponseOrder> active = new ArrayList<>();
    List<GetOrdersResponseOrder> history = new ArrayList<>();

    public List<GetOrdersResponseOrder> getActive() {
      return active;
    }

    public void setActive(List<GetOrdersResponseOrder> active) {
      this.active = active;
    }

    public List<GetOrdersResponseOrder> getHistory() {
      return history;
    }

    public void setHistory(List<GetOrdersResponseOrder> history) {
      this.history = history;
    }
  }

  public static class GetOrdersResponseOrder {
    private Date date;
    private long id;
    private String offreName;
    private String status;
    private String icon;
    private String mobileWebLink;
    private String desktopWebLink;
    private List<String> items = new ArrayList<>();

    public Date getDate() {
      return date;
    }

    public void setDate(Date date) {
      this.date = date;
    }

    public long getId() {
      return id;
    }

    public void setId(long id) {
      this.id = id;
    }

    public String getOffreName() {
      return offreName;
    }

    public void setOffreName(String offreName) {
      this.offreName = offreName;
    }

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }

    public String getIcon() {
      return icon;
    }

    public void setIcon(String icon) {
      this.icon = icon;
    }

    public List<String> getItems() {
      return items;
    }

    public void setItems(List<String> items) {
      this.items = items;
    }

    public String getMobileWebLink() {
      return mobileWebLink;
    }

    public void setMobileWebLink(String mobileWebLink) {
      this.mobileWebLink = mobileWebLink;
    }

    public String getDesktopWebLink() {
      return desktopWebLink;
    }

    public void setDesktopWebLink(String desktopWebLink) {
      this.desktopWebLink = desktopWebLink;
    }
  }

}
