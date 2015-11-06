package com.exallium.h5.api.models.stats.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Enemy {
    /**
     * The Base ID for the enemy.
     */
    @JsonProperty("BaseId")
    private long baseId;

    /**
     * The attachments (variants) for the enemy.
     */
    @JsonProperty("Attachments")
    private List<Long> attachments;

    public long getBaseId() {
        return baseId;
    }

    public List<Long> getAttachments() {
        return attachments;
    }
}
