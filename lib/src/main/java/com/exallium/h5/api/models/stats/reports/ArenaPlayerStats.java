package com.exallium.h5.api.models.stats.reports;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArenaPlayerStats extends SpartanRankedPlayerStats {
    public static class CSR {
        /**
         * The CSR tier.
         */
        @JsonProperty("Tier")
        private int tier;

        /**
         * The Designation of the CSR. Options are:
         * 1 through 5: Normal designations
         * 6 and 7: Semi-pro and Pro respectively
         */
        @JsonProperty("DesignationId")
        private int designationId;

        /**
         * The CSR value. Zero for normal designations.
         */
        @JsonProperty("Csr")
        private int csr;

        /**
         * The percentage of progress towards the next CSR tier.
         */
        @JsonProperty("PercentToNextTier")
        private int percentToNextTier;

        /**
         * If the CSR is Semi-pro or Pro, the player's leaderboard ranking.
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

    /**
     * The Competitive Skill Ranking (CSR) of the player before the match started. If
     * the player is still in measurement matches, this field is null. If the player
     * finished the last measurement match this match, this field is still null.
     */
    @JsonProperty("PreviousCSR")
    private CSR previousCSR;

    /**
     * The Competitive Skill Ranking (CSR) of the player after the match ended. If the
     * player is still in measurement matches, this field is null.
     */
    @JsonProperty("CurrentCSR")
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
