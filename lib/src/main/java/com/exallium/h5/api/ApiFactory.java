package com.exallium.h5.api;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import retrofit.JacksonConverterFactory;
import retrofit.Retrofit;

import java.io.IOException;

public class ApiFactory {

    private static class ApiKeyInterceptor implements Interceptor {

        private final String apiKey;

        private ApiKeyInterceptor(String apiKey) {
            this.apiKey = apiKey;
        }

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            Request newRequest = request.newBuilder()
                    .addHeader("Ocp-Apim-Subscription-Key", apiKey)
                    .build();
            System.out.println(newRequest.httpUrl());
            return chain.proceed(newRequest);
        }
    }

    private final Retrofit retrofit;
    private final ApiKeyInterceptor interceptor;

    public ApiFactory(String apiKey) {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.haloapi.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        interceptor = new ApiKeyInterceptor(apiKey);
        retrofit.client().setFollowRedirects(false);
        retrofit.client().interceptors().add(interceptor);
    }

    /**
     * @return Metadata Adapter, for all metadata requests.
     */
    public Metadata getMetadata() {
        return retrofit.create(Metadata.class);
    }

    /**
     * @return Stats Adapter for Reports, Matches, and Service Records.
     */
    public Stats getStats() {
        return retrofit.create(Stats.class);
    }

    /**
     * @return Profile Adapter for Emblem and Profile Images
     */
    public Profile getProfile() {
        return retrofit.create(Profile.class);
    }

}
