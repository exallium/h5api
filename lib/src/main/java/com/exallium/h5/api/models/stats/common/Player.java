package com.exallium.h5.api.models.stats.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
    /**
     *  The player's gamertag.
     */
    @JsonProperty("Gamertag")
    private String gamertag;

    /**
     * Internal use only. This will always be null.
     */
    @JsonProperty("Xuid")
    private String xuid;

    public String getGamertag() {
        return gamertag;
    }

    public String getXuid() {
        return xuid;
    }
}
