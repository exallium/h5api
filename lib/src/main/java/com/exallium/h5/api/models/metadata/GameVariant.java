package com.exallium.h5.api.models.metadata;

public class GameVariant {
    /**
     * A localized name, suitable for display to users.
     */
    private String name;

    /**
     * A localized description, suitable for display to users.
     */
    private String description;

    /**
     * The ID of the game base variant this is a variant for. Game Base Variants are
     * available via the Metadata API.
     */
    private String gameBaseVariantId;

    /**
     * An icon image for the game variant.
     */
    private String iconUrl;

    /**
     * The ID that uniquely identifies this game variant.
     */
    private String id;

    /**
     * Internal use only. Do not use.
     */
    private String contentId;
}
