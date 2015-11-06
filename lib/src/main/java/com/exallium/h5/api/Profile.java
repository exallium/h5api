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

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface Profile {

    /**
     * This API returns an HTTP Redirect (302 Found) response to the caller
     * with the URL of an image of the player's emblem. The initial request
     * to this API that returns the HTTP Redirect is throttled and requires
     * a subscription key. However, the image itself (at hostname "image.halocdn.com")
     * is not throttled and does not require a subscription key. Note that if
     * the player later changes their emblem, the image itself is not refreshed
     * and will need to be refreshed via a new request to this API.
     *
     * @param player    Gamertag of player
     * @param size      One of 95, 128, 190, 256, 512 (optional)
     * @return Call object for desired emblem
     */
    @GET("/profile/h5/profiles/{player}/emblem")
    Call<Void> getEmblem(@Path("player") String player, @Query("size") int size);

    /**
     * This API returns an HTTP Redirect (302 Found) response to the caller with
     * the URL of an image of the player's Spartan's appearance. The initial
     * request to this API that returns the HTTP Redirect is throttled and requires
     * a subscription key. However, the image itself (at hostname "image.halocdn.com")
     * is not throttled and does not require a subscription key. Note that if the player
     * later changes their Spartan's appearance, the image itself is not refreshed and
     * will need to be refreshed via a new request to this API.
     *
     * @param player    Gamertag of player
     * @param size      One of 95, 128, 190, 256, 512 (optional)
     * @param crop      full or portrait (optional)
     */
    @GET("/profile/h5/profiles/{player}/spartan")
    Call<Void> getSpartan(@Path("player") String player, @Query("size") Integer size, @Query("crop") String crop);
}
