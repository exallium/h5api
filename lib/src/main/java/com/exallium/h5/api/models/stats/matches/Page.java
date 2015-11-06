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

package com.exallium.h5.api.models.stats.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties({"Links"})
public class Page<T> {
    /**
     * The starting point that was used. When the "start" query string parameter is
     * specified, this value is identical. When "start" is omitted, the default value is
     * returned.
     */
    @JsonProperty("Start")
    private int start;

    /**
     * The number of results that the service attempted to retrieve to satisfy this
     * request. Normally this value is equal to the "count" parameter. If the client
     * specified a count parameter greater than the maximum allowed, this value contains
     * the maximum allowed amount.
     */
    @JsonProperty("Count")
    private int count;

    /**
     * The number of results that are actually being returned in this response. This field
     * is named "ResultCount" to avoid confusion with "Count".
     */
    @JsonProperty("ResultCount")
    private int resultCount;

    /**
     * A list of recent matches. Matches are listed in chronological order with the most
     * recently started match first.
     */
    @JsonProperty("Results")
    private List<T> results;

    public int getStart() {
        return start;
    }

    public int getCount() {
        return count;
    }

    public int getResultCount() {
        return resultCount;
    }

    public List<T> getResults() {
        return results;
    }
}
