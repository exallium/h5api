package com.exallium.h5.api.models.stats.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedalAward {

    /**
     * The ID of the Medal. Medals are available via the Metadata API.
     */
    @JsonProperty("MedalId")
    private long medalId;

    /**
     * The number of times the Medal was earned.
     */
    @JsonProperty("Count")
    private int count;

    public long getMedalId() {
        return medalId;
    }

    public int getCount() {
        return count;
    }
}
