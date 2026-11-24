package fr.iskills.web.publicapi.getBasicUserData;

import fr.iskills.web.publicapi.genericModel.JavaScriptType;
import fr.iskills.web.publicapi.genericModel.NotNull;

@JavaScriptType
public class BasicUserData {
    @NotNull
    private int nbUnreadAlerts;
    @NotNull
    private int nbUnreadMessages;
    @NotNull
    private String alertsStatus;
    @NotNull
    private String messagesStatus;
    private String serverVersion;
    private GameInfo currentGame;

    public BasicUserData(int nbUnreadAlerts, int nbUnreadMessages, String alertsStatus, String messagesStatus, String serverVersion) {
        this.nbUnreadAlerts = nbUnreadAlerts;
        this.nbUnreadMessages = nbUnreadMessages;
        this.alertsStatus = alertsStatus;
        this.messagesStatus = messagesStatus;
        this.serverVersion = serverVersion;
    }

    public int getNbUnreadAlerts() {
        return nbUnreadAlerts;
    }

    public void setNbUnreadAlerts(int nbUnreadAlerts) {
        this.nbUnreadAlerts = nbUnreadAlerts;
    }

    public int getNbUnreadMessages() {
        return nbUnreadMessages;
    }

    public void setNbUnreadMessages(int nbUnreadMessages) {
        this.nbUnreadMessages = nbUnreadMessages;
    }

    public String getAlertsStatus() {
        return alertsStatus;
    }

    public void setAlertsStatus(String alertsStatus) {
        this.alertsStatus = alertsStatus;
    }

    public String getMessagesStatus() {
        return messagesStatus;
    }

    public void setMessagesStatus(String messagesStatus) {
        this.messagesStatus = messagesStatus;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public GameInfo getCurrentGame() {
        return currentGame;
    }

    public void setCurrentGame(GameInfo currentGame) {
        this.currentGame = currentGame;
    }
}

