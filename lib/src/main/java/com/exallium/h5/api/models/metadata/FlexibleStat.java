package com.exallium.h5.api.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlexibleStat {
    /**
     * A localized name for the data point, suitable for display to users. The text is
     * title cased.
     */
    private String name;

    /**
     * The type of stat this represents, it is one of the following options:
     *   - Count
     *   - Duration
     */
    private String type;

    /**
     * The ID that uniquely identifies this stat.
     */
    private String id;

    /**
     * Internal use only. Do not use.
     */
    @JsonProperty("contentId")
    private String contentId;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
