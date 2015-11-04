package com.exallium.h5.api.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weapon {
    /**
     * A localized name for the object, suitable for display to users. The text is title
     * cased.
     */
    private String name;

    /**
     * A localized description, suitable for display to users.
     */
    private String description;

    /**
     * The type of the weapon. Options are:
     *   - Grenade
     *   - Turret
     *   - Vehicle
     *   - Standard
     *   - Power
     */
    private String type;

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
     * Indicates whether the weapon is usable by a player.
     */
    @JsonProperty("isUsableByPlayer")
    private boolean isUsableByPlayer;

    /**
     * The ID that uniquely identifies the weapon.
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

    public String getType() {
        return type;
    }

    public String getLargeIconImageUrl() {
        return largeIconImageUrl;
    }

    public String getSmallIconImageUrl() {
        return smallIconImageUrl;
    }

    public boolean isUsableByPlayer() {
        return isUsableByPlayer;
    }

    public long getId() {
        return id;
    }
}
