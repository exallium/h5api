package com.exallium.h5.api.models.stats.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Timelapse {
    /**
     * The ID of the flexible stat.
     */
    @JsonProperty("Id")
    private String id;

    /**
     * The amount of time the flexible stat was earned for. This is expressed as
     * an ISO 8601 Duration.
     */
    @JsonProperty("Timelapse")
    private String timelapse;

    public String getId() {
        return id;
    }

    public String getTimelapse() {
        return timelapse;
    }
}
