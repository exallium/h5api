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

package com.exallium.h5.api.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CSRDesignation {
    /**
     * A localized name for the designation, suitable for display to users. The text is
     * title cased.
     */
    private String name;

    /**
     * An image to use as the background for the designation.
     */
    private String bannerImageUrl;

    /**
     * An array of "Csr Tier" entries, one for each tier this designation supports.
     * Semi-Pro and Pro will not have tiers defined, and this list will be empty.
     */
    private List<CSRTier> tiers;

    /**
     * An ID that identifies the designation. It happens to be the same as the
     * designation ordering. This value is the same across all languages. Note that Id =
     * 0 indicates the player has an "Unranked" designation. The player must complete
     * additional matches before being assigned an official Csr designation.
     */
    private long id;

    /**
     * Internal use only. Do not use.
     */
    @JsonProperty("contentId")
    private String contentId;

    public String getName() {
        return name;
    }

    public String getBannerImageUrl() {
        return bannerImageUrl;
    }

    public List<CSRTier> getTiers() {
        return tiers;
    }

    public long getId() {
        return id;
    }
}
