package com.exallium.h5.api.models.stats.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Csr {
    /**
     * The Csr tier.
     */
    @JsonProperty("Tier")
    private int tier;

    /**
     * The Designation of the Csr. Options are:
     * 1 through 5: Normal designations
     * 6 and 7: Semi-pro and Pro respectively
     */
    @JsonProperty("DesignationId")
    private int designationId;

    /**
     * The Csr value. Zero for normal designations.
     */
    @JsonProperty("Csr")
    private int csr;

    /**
     * The percentage of progress towards the next Csr tier.
     */
    @JsonProperty("PercentToNextTier")
    private int percentToNextTier;

    /**
     * If the Csr is Semi-pro or Pro, the player's leaderboard ranking.
     */
    @JsonProperty("Rank")
    private int rank;

    public int getTier() {
        return tier;
    }

    public int getDesignationId() {
        return designationId;
    }

    public int getCsr() {
        return csr;
    }

    public int getPercentToNextTier() {
        return percentToNextTier;
    }

    public int getRank() {
        return rank;
    }
}
