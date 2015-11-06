package com.exallium.h5.api.models.stats.servicerecords;

import com.exallium.h5.api.models.stats.common.BaseStats;
import com.exallium.h5.api.models.stats.common.FlexibleStats;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WarzoneStat extends BaseStats {

    public static class ScenarioStats extends GameBaseVariantStats {

        /**
         * The total number of "pies" (in-game currency) the player has earned in
         * the scenario.
         */
        @JsonProperty("TotalPiesEarned")
        private long totalPiesEarned;

        /**
         * The game base variant specific stats. Flexible stats are available via
         * the Metadata API.
         */
        @JsonProperty("FlexibleStats")
        private FlexibleStats flexibleStats;

        /**
         * The map global ID that this warzone scenario pertains to. Found in
         * metadata
         */
        @JsonProperty("MapId")
        private String mapId;

        public long getTotalPiesEarned() {
            return totalPiesEarned;
        }

        public FlexibleStats getFlexibleStats() {
            return flexibleStats;
        }

        public String getMapId() {
            return mapId;
        }
    }

    /**
     * The total number of "pies" (in-game currency) the player has earned.
     */
    @JsonProperty("TotalPiesEarned")
    private long totalPiesEarned;

    /**
     * List of scenario stats by map and game base variant id.
     */
    @JsonProperty("ScenarioStats")
    private List<ScenarioStats> scenarioStats;
}
