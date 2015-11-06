package com.exallium.h5.api.models.stats.reports;

import com.exallium.h5.api.models.stats.common.Csr;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ArenaPlayerStats extends SpartanRankedPlayerStats {

    /**
     * The Competitive Skill Ranking (Csr) of the player before the match started. If
     * the player is still in measurement matches, this field is null. If the player
     * finished the last measurement match this match, this field is still null.
     */
    @JsonProperty("PreviousCsr")
    private Csr previousCsr;

    /**
     * The Competitive Skill Ranking (Csr) of the player after the match ended. If the
     * player is still in measurement matches, this field is null.
     */
    @JsonProperty("CurrentCsr")
    private Csr currentCsr;

    /**
     * The player's measurement matches left. If this field is greater than zero, then
     * the player will not have a Csr yet. If the player finished the match, this match
     * is included in this count.
     */
    @JsonProperty("MeasurementMatchesLeft")
    private int measurementMatchesLeft;

    public Csr getPreviousCsr() {
        return previousCsr;
    }

    public Csr getCurrentCsr() {
        return currentCsr;
    }

    public int getMeasurementMatchesLeft() {
        return measurementMatchesLeft;
    }
}
