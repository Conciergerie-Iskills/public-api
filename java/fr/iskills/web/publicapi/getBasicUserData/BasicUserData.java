package fr.iskills.web.publicapi.getBasicUserData;

import fr.iskills.web.publicapi.genericModel.NotNull;

public class BasicUserData {
    @NotNull
    private int nbUnreadAlerts;
    @NotNull
    private int nbUnreadMessages;

    public BasicUserData(int nbUnreadAlerts, int nbUnreadMessages) {
        this.nbUnreadAlerts = nbUnreadAlerts;
        this.nbUnreadMessages = nbUnreadMessages;
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
}
