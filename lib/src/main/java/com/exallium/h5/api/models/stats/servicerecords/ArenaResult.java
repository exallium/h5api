package com.exallium.h5.api.models.stats.servicerecords;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArenaResult extends BaseServiceRecordResult {

    @JsonProperty("ArenaStats")
    private ArenaStat arenaStat;

    public ArenaStat getArenaStat() {
        return arenaStat;
    }
}
