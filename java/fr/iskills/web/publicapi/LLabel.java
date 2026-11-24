package fr.iskills.web.publicapi;

import fr.iskills.web.publicapi.genericModel.JavaScriptType;
import fr.iskills.web.publicapi.genericModel.NotNull;

import java.io.Serializable;
import java.util.Objects;

@JavaScriptType
public class LLabel implements Serializable {
  @NotNull
  private String fr;
  private String en;

  public LLabel(String fr, String en) {
    this.fr = fr;
    this.en = (en == null || en.trim().isEmpty()) ? fr:en;
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

  public LLabel replace(String key, String value) {
    if (value == null) value = "";
    return new LLabel(
            fr == null ? null : fr.replace(key, value),
            en == null ? null : en.replace(key, value)
    );
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LLabel lLabel = (LLabel) o;
    return Objects.equals(fr, lLabel.fr) && Objects.equals(en, lLabel.en);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fr, en);
  }
}
