/*
 * Copyright (c) 2015 Alex Hart
 *
 *
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 *
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 *
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

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
