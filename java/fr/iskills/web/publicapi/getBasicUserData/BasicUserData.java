package fr.iskills.web.publicapi.getBasicUserData;

import fr.iskills.web.publicapi.genericModel.NotNull;

public class BasicUserData {
    @NotNull
    private int nbUnreadAlerts;
    @NotNull
    private int nbUnreadMessages;
    @NotNull
    private String alertsStatus;
    @NotNull
    private String messagesStatus;
    @NotNull
    private boolean canChooseLanguage;

    public BasicUserData(int nbUnreadAlerts, int nbUnreadMessages, String alertsStatus, String messagesStatus, boolean canChooseLanguage) {
        this.nbUnreadAlerts = nbUnreadAlerts;
        this.nbUnreadMessages = nbUnreadMessages;
        this.alertsStatus = alertsStatus;
        this.messagesStatus = messagesStatus;
        this.canChooseLanguage = canChooseLanguage;
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

    public boolean isCanChooseLanguage() {
        return canChooseLanguage;
    }

    public void setCanChooseLanguage(boolean canChooseLanguage) {
        this.canChooseLanguage = canChooseLanguage;
    }
}
