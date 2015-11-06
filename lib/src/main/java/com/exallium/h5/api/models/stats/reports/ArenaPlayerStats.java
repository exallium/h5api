package com.exallium.h5.api.models.stats.reports;

import com.exallium.h5.api.models.stats.common.CSR;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ArenaPlayerStats extends SpartanRankedPlayerStats {

    /**
     * The Competitive Skill Ranking (CSR) of the player before the match started. If
     * the player is still in measurement matches, this field is null. If the player
     * finished the last measurement match this match, this field is still null.
     */
    @JsonProperty("PreviousCsr")
    private CSR previousCSR;

    /**
     * The Competitive Skill Ranking (CSR) of the player after the match ended. If the
     * player is still in measurement matches, this field is null.
     */
    @JsonProperty("CurrentCsr")
    private CSR currentCSR;

    /**
     * The player's measurement matches left. If this field is greater than zero, then
     * the player will not have a CSR yet. If the player finished the match, this match
     * is included in this count.
     */
    @JsonProperty("MeasurementMatchesLeft")
    private int measurementMatchesLeft;

    public CSR getPreviousCSR() {
        return previousCSR;
    }

    public CSR getCurrentCSR() {
        return currentCSR;
    }

    public int getMeasurementMatchesLeft() {
        return measurementMatchesLeft;
    }
}
