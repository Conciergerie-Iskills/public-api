package fr.iskills.web.publicapi.getBasicUserData;

import fr.iskills.web.publicapi.genericModel.JavaScriptType;
import fr.iskills.web.publicapi.genericModel.NotNull;

@JavaScriptType
public class GameInfo {
  @NotNull
  long eggHunt;
  @NotNull
  boolean acceptedYet;
  @NotNull
  String shouldShowEgg;

  @NotNull
  double x;

  @NotNull
  double y;

  public GameInfo(long eggHunt, boolean acceptedYet, String shouldShowEgg, double x, double y) {
    this.eggHunt = eggHunt;
    this.acceptedYet = acceptedYet;
    this.shouldShowEgg = shouldShowEgg;
    this.x=x;
    this.y=y;
  }

  public long getEggHunt() {
    return eggHunt;
  }

  public boolean isAcceptedYet() {
    return acceptedYet;
  }

  public String getShouldShowEgg() {
    return shouldShowEgg;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
}
