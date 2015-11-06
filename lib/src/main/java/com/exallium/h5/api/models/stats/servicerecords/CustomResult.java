package com.exallium.h5.api.models.stats.servicerecords;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomResult extends BaseServiceRecordResult {

    @JsonProperty("CustomStats")
    private CustomStat customStat;

    public CustomStat getCustomStat() {
        return customStat;
    }
}
