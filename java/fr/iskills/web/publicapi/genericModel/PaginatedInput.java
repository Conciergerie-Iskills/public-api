package fr.iskills.web.publicapi.genericModel;

public class PaginatedInput extends Input {
  @NotNull
  private InputPage pageData;

  public PaginatedInput(InputPage pageData) {
    this.pageData = pageData;
  }

  public InputPage getPageData() {
    return pageData;
  }

  public void setPageData(InputPage pageData) {
    this.pageData = pageData;
  }
}
