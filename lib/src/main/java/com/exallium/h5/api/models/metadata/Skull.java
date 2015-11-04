package com.exallium.h5.api.models.metadata;

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
     * The ID that uniquely identifies this skull.
     */
    private int id;

    /**
     * Internal use only. Do not use.
     */
    private String contentId;
}
