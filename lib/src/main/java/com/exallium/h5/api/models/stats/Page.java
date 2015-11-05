package com.exallium.h5.api.models.stats;

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
}
