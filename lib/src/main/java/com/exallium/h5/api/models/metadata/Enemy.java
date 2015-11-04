package com.exallium.h5.api.models.metadata;

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
    private String largeIconUrl;

    /**
     * A reference to a small image for icon use. This may be null if there is no image
     * defined.
     */
    private String smallIconUrl;

    /**
     * The ID that uniquely identifies this enemy.
     */
    private int id;

    /**
     * Internal use only. Do not use.
     */
    private String contentId;

}
