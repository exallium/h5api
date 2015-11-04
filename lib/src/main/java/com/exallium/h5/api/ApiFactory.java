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

    public ApiFactory(String apiKey) {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.haloapi.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        retrofit.client().interceptors().add(new ApiKeyInterceptor(apiKey));
    }

    public Metadata getMetadata() {
        return retrofit.create(Metadata.class);
    }

    public Profile getProfile() {
        return retrofit.create(Profile.class);
    }

    public Stats getStats() {
        return retrofit.create(Stats.class);
    }

}
