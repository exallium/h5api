package com.exallium.h5.api.models.stats.reports;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TeamStats {

    public static class RoundStats {
        /**
         * The round number this entry pertains to.
         */
        @JsonProperty("RoundNumber")
        private int roundNumber;

        /**
         * The end rank for the team this round.
         */
        @JsonProperty("Rank")
        private int rank;

        /**
         * The end score for the team this round.
         */
        @JsonProperty("Score")
        private int score;

        public int getRoundNumber() {
            return roundNumber;
        }

        public int getRank() {
            return rank;
        }

        public int getScore() {
            return score;
        }
    }


    /**
     * The ID for the team.
     */
    @JsonProperty("TeamId")
    private int teamId;

    /** The team's score at the end of the match. The way the score is determined is
     * based off the game base variant being played:
     *  Breakout = number of rounds won,
     *  CTF = number of flag captures,
     *  Slayer = number of kills,
     *  Strongholds = number of points,
     *  Warzone = number of points.
     */
    @JsonProperty("Score")
    private int score;

    /**
     * The team's rank at the end of the match.
     */
    @JsonProperty("Rank")
    private int rank;

    /**
     * The set of round stats for the team.
     */
    @JsonProperty("RoundStats")
    private List<RoundStats> roundStats;

    public int getTeamId() {
        return teamId;
    }

    public int getScore() {
        return score;
    }

    public int getRank() {
        return rank;
    }

    public List<RoundStats> getRoundStats() {
        return roundStats;
    }
}
