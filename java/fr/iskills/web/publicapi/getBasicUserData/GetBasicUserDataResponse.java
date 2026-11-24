package fr.iskills.web.publicapi.getBasicUserData;

import fr.iskills.web.publicapi.genericModel.NotNull;
import fr.iskills.web.publicapi.genericModel.GenericPublicApiResponse;

public class GetBasicUserDataResponse extends GenericPublicApiResponse {
    @NotNull
    private BasicUserData data;
    public GetBasicUserDataResponse(String message, int code, BasicUserData data) {
        super(message, code);
        this.data = data;
    }

    public BasicUserData getData() {
        return data;
    }

    public void setData(BasicUserData data) {
        this.data = data;
    }
}
