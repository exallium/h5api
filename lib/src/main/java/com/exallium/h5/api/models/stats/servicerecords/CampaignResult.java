package com.exallium.h5.api.models.stats.servicerecords;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CampaignResult extends BaseServiceRecordResult {

    @JsonProperty("CampaignStat")
    private CampaignStat campaignStat;

    public CampaignStat getCampaignStat() {
        return campaignStat;
    }
}
