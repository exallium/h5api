package com.exallium.h5.api.models.stats.servicerecords;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WarzoneResult extends BaseServiceRecordResult {

    @JsonProperty("WarzoneStat")
    private WarzoneStat warzoneStat;

    public WarzoneStat getWarzoneStat() {
        return warzoneStat;
    }
}
