package fr.iskills.web.publicapi.genericModel;

public class ResponsePage {
  @NotNull
  private int firstElementIndex;
  @NotNull
  private int numberOfElements;
  @NotNull
  private int totalNumberOfElements;

  public ResponsePage(int firstElementIndex, int numberOfElements, int totalNumberOfElements) {
    this.firstElementIndex = firstElementIndex;
    this.numberOfElements = numberOfElements;
    this.totalNumberOfElements = totalNumberOfElements;
  }

  public int getFirstElementIndex() {
    return firstElementIndex;
  }

  public void setFirstElementIndex(int firstElementIndex) {
    this.firstElementIndex = firstElementIndex;
  }

  public int getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(int numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public int getTotalNumberOfElements() {
    return totalNumberOfElements;
  }

  public void setTotalNumberOfElements(int totalNumberOfElements) {
    this.totalNumberOfElements = totalNumberOfElements;
  }
}
