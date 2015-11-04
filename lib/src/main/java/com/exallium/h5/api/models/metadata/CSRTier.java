package com.exallium.h5.api.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CSRTier {

    /**
     * An image to use as the icon for th tier.
     */
    private String iconImageUrl;

    /**
     * An ID that identifies the tier.
     */
    private long id;

    /**
     * Internal use only. Do not use.
     */
    @JsonProperty("contentId")
    private String contentId;

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public long getId() {
        return id;
    }
}
