package com.exallium.h5.api.models.stats.reports;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CampaignPlayerStats extends BasePlayerStats {
    /**
     * The player's biggest score due to a kill.
     */
    @JsonProperty("BiggestKillScore")
    private int biggestKillScore;

    /**
     * The player's score.
     */
    @JsonProperty("Score")
    private int score;

    public int getBiggestKillScore() {
        return biggestKillScore;
    }

    public int getScore() {
        return score;
    }
}
