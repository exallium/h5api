package com.exallium.h5.api.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameVariant {
    /**
     * A localized name, suitable for display to users.
     */
    private String name;

    /**
     * Internal use. The internal non-localized name for the the game base variant.
     */
    private String internalName;

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
    @JsonProperty("contentId")
    private String contentId;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getGameBaseVariantId() {
        return gameBaseVariantId;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getId() {
        return id;
    }

    public String getInternalName() {
        return internalName;
    }
}
