package com.exallium.h5.api.models.stats.reports;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CampaignCarnageReport extends BaseCarnageReport<CampaignPlayerStats> {

    /**
     * The total playthrough time of the mission as calculated by the game. This value is
     * persisted in save files.
     */
    @JsonProperty("TotalMissionPlaythroughTime")
    private String totalMissionPlaythroughTime;

    /** The difficulty the mission was played at. Options are:
     * Easy = 0,
     * Normal = 1,
     * Heroic = 2,
     * Legendary = 3
     */
    @JsonProperty("Difficulty")
    private int difficulty;

    /**
     * The list of skulls used for the mission. Skulls are available via the Metadata API.
     */
    @JsonProperty("Skulls")
    private List<Integer> skulls;

    /**
     * Indicates whether the mission was completed when the match ended.
     */
    @JsonProperty("MissionCompleted")
    private boolean missionCompleted;

    public String getTotalMissionPlaythroughTime() {
        return totalMissionPlaythroughTime;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public List<Integer> getSkulls() {
        return skulls;
    }

    public boolean isMissionCompleted() {
        return missionCompleted;
    }
}
