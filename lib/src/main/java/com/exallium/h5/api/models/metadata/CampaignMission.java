package com.exallium.h5.api.models.metadata;

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
    private String contentId;
}
