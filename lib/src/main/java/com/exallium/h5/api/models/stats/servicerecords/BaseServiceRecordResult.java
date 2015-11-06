package com.exallium.h5.api.models.stats.servicerecords;

import com.exallium.h5.api.models.stats.common.Player;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseServiceRecordResult {

    /**
     * Information about the player for whom this data was returned.
     */
    @JsonProperty("PlayerId")
    private Player player;

    /**
     * The player's Spartan Rank. Zero for campaign.
     */
    @JsonProperty("SpartanRank")
    private int spartanRank;

    /**
     * The player's XP. Zero for campaign.
     */
    @JsonProperty("Xp")
    private long xp;

    public Player getPlayer() {
        return player;
    }

    public int getSpartanRank() {
        return spartanRank;
    }

    public long getXp() {
        return xp;
    }
}
