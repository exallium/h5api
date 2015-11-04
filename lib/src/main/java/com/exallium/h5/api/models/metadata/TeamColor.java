package com.exallium.h5.api.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamColor {
    /**
     * A localized name, suitable for display to users.
     */
    private String name;

    /**
     * A localized description, suitable for display to users.
     */
    private String description;

    /**
     * A seven-character string representing the team color in "RGB Hex" notation. This
     * notation uses a "#" followed by a hex triplet.
     */
    private String color;

    /**
     * A reference to an image for icon use. This may be null if there is no image
     * defined.
     */
    private String iconUrl;

    /**
     * The ID that uniquely identifies this color. This will be the same as the team's ID
     * in responses from the Stats API.
     */
    private long id;

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

    public String getColor() {
        return color;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public long getId() {
        return id;
    }
}
