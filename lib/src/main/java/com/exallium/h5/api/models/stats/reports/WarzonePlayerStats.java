package com.exallium.h5.api.models.stats.reports;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WarzonePlayerStats extends SpartanRankedPlayerStats {
    /**
     * The maximum level the player achieved in the match.
     */
    @JsonProperty("WarzoneLevel")
    private int warzoneLevel;

    /**
     * The total number of "pies" (in-game currency) the player earned in the match.
     */
    @JsonProperty("TotalPiesEarned")
    private int totalPiesEarned;
}
