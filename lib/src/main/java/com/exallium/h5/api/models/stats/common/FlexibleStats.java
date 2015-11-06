package com.exallium.h5.api.models.stats.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FlexibleStats {
    /**
     * The set of flexible stats that are derived from medal events.
     */
    @JsonProperty("MedalStatCounts")
    private List<StatCount> medalStatCounts;

    /**
     * The set of flexible stats that are derived from impulse events.
     */
    @JsonProperty("ImpulseStatCounts")
    private List<StatCount> impulseStatCounts;

    /**
     * The set of flexible stats that are derived from medal time lapses.
     */
    @JsonProperty("MedalTimelapses")
    private List<Timelapse> medalTimelapses;

    /**
     * The set of flexible stats that are derived from impulse time lapses.
     */
    @JsonProperty("ImpulseTimelapses")
    private List<Timelapse> impulseTimelapses;

    public List<StatCount> getMedalStatCounts() {
        return medalStatCounts;
    }

    public List<StatCount> getImpulseStatCounts() {
        return impulseStatCounts;
    }

    public List<Timelapse> getMedalTimelapses() {
        return medalTimelapses;
    }

    public List<Timelapse> getImpulseTimelapses() {
        return impulseTimelapses;
    }
}
