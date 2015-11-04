package com.exallium.h5.api.models.metadata;

import java.util.List;

public class GameBaseVariant {
    /**
     * A localized name for the game base variant, suitable for display to users. The
     * text is title cased.
     */
    private String name;

    /**
     * Internal use. The internal non-localized name for the the game base variant.
     */
    private String internalName;

    /**
     * An image to use as the game base variant for the designation.
     */
    private String iconUrl;

    /**
     * A list that indicates what game modes this base variant is available within.
     * Options are:
     *   - Arena
     *   - Campaign
     *   - Custom
     *   - Warzone
     */
    private List<String> supportedGameModes;

    /**
     * The ID that uniquely identifies this game base variant.
     */
    private String id;

    /**
     * Internal use only. Do not use.
     */
    private String contentId;


}
