package com.exallium.h5.api.models.stats.servicerecords;

import com.exallium.h5.api.models.stats.common.BaseStats;
import com.exallium.h5.api.models.stats.common.FlexibleStats;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GameBaseVariantStats extends BaseStats {

    /**
     * The ID of the game base variant. Game base variants are available via
     * the Metadata API.
     */
    @JsonProperty("GameBaseVariantId")
    private String gameBaseVariantId;

    /**
     * The game base variant specific stats. Flexible stats are available via
     * the Metadata API.
     */
    @JsonProperty("FlexibleStats")
    private FlexibleStats flexibleStats;

    public String getGameBaseVariantId() {
        return gameBaseVariantId;
    }

    public FlexibleStats getFlexibleStats() {
        return flexibleStats;
    }
}
