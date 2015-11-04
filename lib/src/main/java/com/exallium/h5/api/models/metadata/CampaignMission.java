package com.exallium.h5.api.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CampaignMission {
    /**
     * Order of mission in story
     */
    private int missionNumber;

    /**
     * A localized name
     */
    private String name;

    /**
     * A localized description
     */
    private String description;

    /**
     * Background image for Mission
     */
    private String imageUrl;

    /**
     * Osiris or Blue Team
     */
    private String type;

    /**
     * Unique ID for Mission
     */
    private String id;

    /**
     * Internal Use Only. Do not use.
     */
    @JsonProperty("contentId")
    private String contentId;

    public int getMissionNumber() {
        return missionNumber;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }
}
