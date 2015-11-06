package com.exallium.h5.api.models.stats.servicerecords;

import com.exallium.h5.api.models.stats.common.BaseStats;
import com.exallium.h5.api.models.stats.common.FlexibleStats;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class CampaignStat extends BaseStats {

    public static class CampaignMissionStats extends BaseStats {

        /**
         * The game base variant specific stats. Flexible stats are available via
         * the Metadata API.
         */
        @JsonProperty("FlexibleStats")
        private FlexibleStats flexibleStats;

        /**
         * The set of stats from missions completed while playing co-op. The key is
         * the difficulty and the value is the playthrough stats for that
         * difficulty. Empty if there are no finished playthroughs.
         *
         * Easy 0, Normal 1, Heroic 2, Legendary 3
         */
        @JsonProperty("CoopStats")
        Map<Integer, PlaythroughStats> coopStats;

        /**
         * The set of stats from missions completed while playing solo. The key is
         * the difficulty and the value is the playthrough stats for that
         * difficulty. Empty if there are no finished playthroughs.
         *
         * Easy 0, Normal 1, Heroic 2, Legendary 3
         */
        @JsonProperty("SoloStats")
        Map<Integer, PlaythroughStats> soloStats;

        /**
         * The mission ID that pertains to this mission. Can be found in metadata.
         */
        @JsonProperty("MissionId")
        private String missionId;

        public FlexibleStats getFlexibleStats() {
            return flexibleStats;
        }

        public Map<Integer, PlaythroughStats> getCoopStats() {
            return coopStats;
        }

        public Map<Integer, PlaythroughStats> getSoloStats() {
            return soloStats;
        }

        public String getMissionId() {
            return missionId;
        }
    }

    public static class PlaythroughStats {

        /**
         * The highest score achieved by the player on this difficulty.
         */
        @JsonProperty("HighestScore")
        private long highestScore;

        /**
         * The fastest completion time by the player on this difficulty.
         */
        @JsonProperty("FastestCompletionTime")
        private String fastestCompletionTime;

        /**
         * The aggregate set of skulls the player managed to finish this
         * mission on this difficulty. Not most in a single run, but which have
         * been completed overall.
         */
        @JsonProperty("Skulls")
        private List<Integer> skulls;

        /**
         * The number of times this mission was completed by the player on this
         * difficulty.
         */
        @JsonProperty("TotalTimesCompleted")
        private long totalTimesCompleted;

        /**
         * True if the mission was completed with all of the skulls on in one
         * playthrough for this difficulty. False otherwise.This field is
         * provided to disambiguate the case where the Skulls set contains all
         * the Skulls but the player played through the mission multiple times,
         * each with a different Skull (as opposed to playing through the
         * mission with ALL the skulls enabled).
         */
        @JsonProperty("AllSkullsOn")
        private boolean allSkullsOn;

        public long getHighestScore() {
            return highestScore;
        }

        public String getFastestCompletionTime() {
            return fastestCompletionTime;
        }

        public List<Integer> getSkulls() {
            return skulls;
        }

        public long getTotalTimesCompleted() {
            return totalTimesCompleted;
        }

        public boolean isAllSkullsOn() {
            return allSkullsOn;
        }
    }

    /**
     * List of campaign stats by mission ID.
     */
    @JsonProperty("CampaignMissionStats")
    private List<CampaignMissionStats> campaignMissionStats;

    public List<CampaignMissionStats> getCampaignMissionStats() {
        return campaignMissionStats;
    }
}
