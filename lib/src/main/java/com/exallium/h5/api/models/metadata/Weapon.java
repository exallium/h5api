package com.exallium.h5.api.models.metadata;

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
    private boolean isUsableByPlayer;

    /**
     * The ID that uniquely identifies the weapon.
     */
    private int id;

    /**
     * Internal use only. Do not use.
     */
    private String contentId;
}
