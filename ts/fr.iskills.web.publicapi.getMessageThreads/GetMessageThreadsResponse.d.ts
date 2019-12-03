/// <reference path="GetMessageThreadsResponseData.d.ts" />
/// <reference path="../fr.iskills.web.publicapi.genericModel/ResponsePage.d.ts" />

// AUTO-GENERATED FILE, DO NOT MODIFY!

interface GetMessageThreadsResponse {
    message: string;
    code: number;
    notifications?: number;
    generatedTime: number;
    pageInformation: ResponsePage;
    data: GetMessageThreadsResponseData;
}