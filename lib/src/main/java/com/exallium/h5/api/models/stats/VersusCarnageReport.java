package com.exallium.h5.api.models.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class VersusCarnageReport<S extends BasePlayerStats> extends BaseCarnageReport {

    /**
     * A list of stats for each player who was present in the match.
     */
    @JsonProperty("PlayerStats")
    private List<S> playerStats;

    /**
     * A list of stats for each team who in the match. Note that in Free For All modes,
     * there is an entry for every player.
     */
    @JsonProperty("TeamStats")
    private List<TeamStats> teamStats;

}
