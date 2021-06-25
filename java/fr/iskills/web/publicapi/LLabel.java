package fr.iskills.web.publicapi;

import fr.iskills.web.publicapi.genericModel.NotNull;

public class LLabel {
  @NotNull
  private String fr;
  private String en;

  public LLabel(String fr, String en) {
    this.fr = fr;
    this.en = en == null ? fr:en;
  }

  public String getFr() {
    return fr;
  }

  public void setFr(String fr) {
    this.fr = fr;
  }

  public String getEn() {
    return en;
  }

  public void setEn(String en) {
    this.en = en;
  }

  @Override
  public String toString() {
    return "{fr:\""+fr+"\",en:\'"+en+"\"}";
  }

  public LLabel format(String param1) {
    return new LLabel(
        String.format(fr, param1),
        String.format(en, param1)
    );
  }
}
