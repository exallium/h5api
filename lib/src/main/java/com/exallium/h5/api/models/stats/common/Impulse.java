package com.exallium.h5.api.models.stats.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Impulse {

    /**
     * The ID of the Impulse. Impulses are available via the Metadata API.
     */
    @JsonProperty("Id")
    private long id;

    /**
     * The number of times the Impuse was earned.
     */
    @JsonProperty("Count")
    private int count;

    public long getId() {
        return id;
    }

    public int getCount() {
        return count;
    }
}
