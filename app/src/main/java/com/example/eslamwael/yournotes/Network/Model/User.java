package com.example.eslamwael.yournotes.Network.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by eslamwael74 on 6/27/2018.
 * Email: eslamwael74@outlook.com.
 */
public class User extends BaseResponse {
    @SerializedName("api_key")
    String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
