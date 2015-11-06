package com.exallium.h5.api.models.stats.reports;

import com.exallium.h5.api.models.stats.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"PreMatchRatings", "PostMatchRatings"})
public class BasePlayerStats extends BaseStats {

    /**
     * The game base variant specific stats for this match. Flexible stats are
     * available via the Metadata API.
     */
    @JsonProperty("FlexibleStats")
    private FlexibleStats flexibleStats;

    @JsonProperty("Player")
    private Player player;

    /**
     * The ID of the team that the player was on when the match ended.
     */
    @JsonProperty("TeamId")
    private int teamId;

    /**
     * The player's team-agnostic ranking.
     */
    @JsonProperty("Rank")
    private int rank;

    /**
     * Indicates whether the player was present in the match when it ended.
     */
    @JsonProperty("DNF")
    private boolean dnf;

    /**
     * The player's average lifetime.
     */
    @JsonProperty("AvgLifeTimeOfPlayer")
    private String avgLifeTimeOfPlayer;

    public FlexibleStats getFlexibleStats() {
        return flexibleStats;
    }

    public Player getPlayer() {
        return player;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getRank() {
        return rank;
    }

    public boolean isDnf() {
        return dnf;
    }

    public String getAvgLifeTimeOfPlayer() {
        return avgLifeTimeOfPlayer;
    }

}
