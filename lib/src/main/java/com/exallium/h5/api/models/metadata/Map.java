package com.exallium.h5.api.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Map {
    /**
     * A localized name, suitable for display to users.
     */
    private String name;

    /**
     * A localized description, suitable for display to users.
     */
    private String description;

    /**
     * This lists all the game modes to which this map is available. Options are:
     *   - Arena
     *   - Campaign
     *   - Custom
     *   - Warzone
     */
    private List<String> supportedGameModes;

    /**
     * A reference to an image. This may be null if there is no image defined.
     */
    private String imageUrl;

    /**
     * The ID that uniquely identifies this map.
     */
    private String id;

    /**
     * Internal use only. Do not use.
     */
    @JsonProperty("contentId")
    private String contentId;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getSupportedGameModes() {
        return supportedGameModes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getId() {
        return id;
    }
}
