package com.exallium.h5.api.models.stats.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatCount {
    /**
     * The ID of the flexible stat.
     */
    @JsonProperty("Id")
    private String id;

    /**
     * The number of times this flexible stat was earned.
     */
    @JsonProperty("Count")
    private int count;

    public String getId() {
        return id;
    }

    public int getCount() {
        return count;
    }
}
