package com.exallium.h5.api.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Enemy {

    /**
     * The faction that this enemy is affiliated with. One of the following options:
     *   - UNSC
     *   - Covenant
     *   - Promethean
     */
    private String faction;

    /**
     * A localized name for the object, suitable for display to users. The text is title
     * cased.
     */
    private String name;

    /**
     * A localized description, suitable for display to users. Note: This may be null.
     */
    private String description;

    /**
     * A reference to a large image for icon use. This may be null if there is no image
     * defined.
     */
    private String largeIconImageUrl;

    /**
     * A reference to a small image for icon use. This may be null if there is no image
     * defined.
     */
    private String smallIconImageUrl;

    /**
     * The ID that uniquely identifies this enemy.
     */
    private long id;

    /**
     * Internal use only. Do not use.
     */
    @JsonProperty("contentId")
    private String contentId;

    public String getFaction() {
        return faction;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLargeIconImageUrl() {
        return largeIconImageUrl;
    }

    public String getSmallIconImageUrl() {
        return smallIconImageUrl;
    }

    public long getId() {
        return id;
    }
}
