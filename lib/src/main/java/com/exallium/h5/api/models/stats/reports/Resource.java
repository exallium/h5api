package com.exallium.h5.api.models.stats.reports;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Resource {

    /**
     * 2 - GameVariant
     * 3 - MatchVariant
     */
    @JsonProperty("ResourceType")
    private int resourceType;

    /**
     * The ID of the resource. Can be linked to metadata.
     */
    @JsonProperty("ResourceId")
    private String resourceId;

    /**
     * The source of the map variant. Options are:
     *   Unknown = 0
     *   User-generated = 1 and 2,
     *   Official = 3.
     */
    @JsonProperty("OwnerType")
    private String ownerType;

    /**
     * The owner. Usually set to null.
     */
    @JsonProperty("Owner")
    private String owner;

    public int getResourceType() {
        return resourceType;
    }

    public String getResourceId() {
        return resourceId;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public String getOwner() {
        return owner;
    }
}
