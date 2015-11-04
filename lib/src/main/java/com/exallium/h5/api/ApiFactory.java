package com.exallium.h5.api;

import retrofit.Retrofit;

public class ApiFactory {

    // TODO: Require App to Supply an API Key
    private static final Retrofit RETROFIT = new Retrofit.Builder()
            .baseUrl("http://www.haloapi.com")
            .build();

    private ApiFactory() {}

    public static Metadata getMetadata() {
        return RETROFIT.create(Metadata.class);
    }

    public static Profile getProfile() {
        return RETROFIT.create(Profile.class);
    }

    public static Stats getStats() {
        return RETROFIT.create(Stats.class);
    }

}
