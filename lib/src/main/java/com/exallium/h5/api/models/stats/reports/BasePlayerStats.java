/*
 * Copyright (c) 2015 Alex Hart
 *
 *
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 *
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 *
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.exallium.h5.api.models.stats.reports;

import com.exallium.h5.api.models.stats.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"PreMatchRatings", "PostMatchRatings"})
public class BasePlayerStats extends BaseStats {

    /**
     * The game base variant specific stats for this match. Flexible stats are
     * available via the Metadata API.
     */
    @JsonProperty("FlexibleStats")
    private FlexibleStats flexibleStats;

    @JsonProperty("Player")
    private Player player;

    /**
     * The ID of the team that the player was on when the match ended.
     */
    @JsonProperty("TeamId")
    private int teamId;

    /**
     * The player's team-agnostic ranking.
     */
    @JsonProperty("Rank")
    private int rank;

    /**
     * Indicates whether the player was present in the match when it ended.
     */
    @JsonProperty("DNF")
    private boolean dnf;

    /**
     * The player's average lifetime.
     */
    @JsonProperty("AvgLifeTimeOfPlayer")
    private String avgLifeTimeOfPlayer;

    public FlexibleStats getFlexibleStats() {
        return flexibleStats;
    }

    public Player getPlayer() {
        return player;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getRank() {
        return rank;
    }

    public boolean isDnf() {
        return dnf;
    }

    public String getAvgLifeTimeOfPlayer() {
        return avgLifeTimeOfPlayer;
    }

}
