package com.exallium.h5.api.models.stats.servicerecords;

import com.exallium.h5.api.models.stats.common.BaseStats;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CustomStat extends BaseStats {

    /**
     * List of custom stats by CustomGameBaseVariant
     */
    @JsonProperty("CustomGameBaseVariantStats")
    private List<GameBaseVariantStats> customGameBaseVariantStats;

    /**
     * A list of up to 3 game base variants with the highest win rate by the user.
     * If there is a tie, the one with more completions is higher. If there's still
     * a tie, the GUIDs are sorted and selected.
     */
    @JsonProperty("TopGameBaseVariants")
    private List<VariantRecord> topGameBaseVariants;
}
