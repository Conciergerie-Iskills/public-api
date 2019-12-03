package fr.iskills.web.publicapi.genericModel;

public class InputPage {
  @NotNull
  private int firstElementIndex;
  @NotNull
  private int numberOfElements;

  public InputPage(int firstElementIndex, int numberOfElements) {
    this.firstElementIndex = firstElementIndex;
    this.numberOfElements = numberOfElements;
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
}
