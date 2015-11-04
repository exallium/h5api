package com.exallium.h5.api.models.metadata;

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
    private int id;

    /**
     * Internal use only. Do not use.
     */
    private String contentId;
}
