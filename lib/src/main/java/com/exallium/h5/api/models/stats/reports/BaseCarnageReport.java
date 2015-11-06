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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties({"SeasonId"})
public class BaseCarnageReport<S extends BasePlayerStats> {

    /**
     * A list of stats for each player who was present in the match.
     */
    @JsonProperty("PlayerStats")
    private List<S> playerStats;

    /**
     * Indicates if the match is completed or not. Some match details are available while
     * the match is in-progress, but the behavior for incomplete matches in undefined.
     */
    @JsonProperty("IsMatchOver")
    private boolean isMatchOver;

    /**
     * The length of the match. This is expressed as an ISO 8601 Duration.
     */
    @JsonProperty("TotalDuration")
    private String totalDuration;

    /**
     * The variant of the map for this match. Map variants are available via the Metadata
     * API.
     */
    @JsonProperty("MapVariantId")
    private String mapVariantId;

    /**
     * The variant of the game for this match. Game variants are available via the Metadata
     * API
     */
    @JsonProperty("GameVariantId")
    private String gameVariantId;

    /**
     * The playlist ID of the match. Playlists are available via the Metadata API.
     */
    @JsonProperty("PlaylistId")
    private String playlistId;

    /**
     * The ID of the base map for this match. Maps are available via the Metadata API.
     */
    @JsonProperty("MapId")
    private String mapId;

    /**
     * The ID of the game base variant for this match. Game base variants are available via
     * the Metadata API.
     */
    @JsonProperty("GameBaseVariantId")
    private String gameBaseVariantId;

    /**
     * Whether this was a team-based game or not.
     */
    @JsonProperty("IsTeamGame")
    private boolean isTeamGame;

    public List<S> getPlayerStats() {
        return playerStats;
    }

    public boolean isMatchOver() {
        return isMatchOver;
    }

    public String getTotalDuration() {
        return totalDuration;
    }

    public String getMapVariantId() {
        return mapVariantId;
    }

    public String getGameVariantId() {
        return gameVariantId;
    }

    public String getPlaylistId() {
        return playlistId;
    }

    public String getMapId() {
        return mapId;
    }

    public String getGameBaseVariantId() {
        return gameBaseVariantId;
    }

    public boolean isTeamGame() {
        return isTeamGame;
    }
}
