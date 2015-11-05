package com.exallium.h5.api.models.stats.reports;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class VersusCarnageReport<S extends VersusPlayerStats> extends BaseCarnageReport<S> {

    /**
     * A list of stats for each team who in the match. Note that in Free For All modes,
     * there is an entry for every player.
     */
    @JsonProperty("TeamStats")
    private List<TeamStats> teamStats;

}
