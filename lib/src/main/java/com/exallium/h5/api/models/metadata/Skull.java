package com.exallium.h5.api.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Skull {

    /**
     * A localized name, suitable for display to users. The text is title cased.
     */
    private String name;

    /**
     * A localized description, suitable for display to users.
     */
    private String description;

    /**
     * Indicates what mission this skull can be located within. Null when the skull is
     * not found in a mission. Missions are available via the Metadata API.
     */
    private String missionId;

    /**
     * URL Path for Skull
     */
    private String imageUrl;

    /**
     * The ID that uniquely identifies this skull.
     */
    private long id;

    /**
     * Internal use only. Do not use.
     */
    @JsonProperty("contentId")
    private String contentId;

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getMissionId() {
        return missionId;
    }

    public long getId() {
        return id;
    }
}
