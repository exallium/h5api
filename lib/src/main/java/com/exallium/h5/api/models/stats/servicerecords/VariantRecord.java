package com.exallium.h5.api.models.stats.servicerecords;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VariantRecord {
    /**
     * Rank between 1-3
     */
    @JsonProperty("GameBaseVariantRank")
    private int gameBaseVariantRank;

    /**
     * Number of games played in game base variant
     */
    @JsonProperty("NumberOfMatchesCompleted")
    private long numberOfMatchesCompleted;

    /**
     * Id of the game base variant
     */
    @JsonProperty("GameBaseVariantId")
    private String gameBaseVariantId;

    /**
     * Number of matches won on game base variant
     */
    @JsonProperty("NumberOfMatchesWon")
    private long numberOfMatchesWon;

    public int getGameBaseVariantRank() {
        return gameBaseVariantRank;
    }

    public long getNumberOfMatchesCompleted() {
        return numberOfMatchesCompleted;
    }

    public String getGameBaseVariantId() {
        return gameBaseVariantId;
    }

    public long getNumberOfMatchesWon() {
        return numberOfMatchesWon;
    }
}
