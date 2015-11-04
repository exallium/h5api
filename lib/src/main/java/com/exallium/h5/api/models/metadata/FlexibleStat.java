package com.exallium.h5.api.models.metadata;

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
    private String contentId;
}
