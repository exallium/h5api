package com.exallium.h5.api.models.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PostGameCarnageReport {

    /**
     * A list of stats for each player who was present in the match.
     */
    @JsonProperty("PlayerStats")
    private List<PlayerStats> playerStats;

    /**
     * A list of stats for each team who in the match. Note that in Free For All modes,
     * there is an entry for every player.
     */
    @JsonProperty("TeamStats")
    private List<TeamStats> teamStats;

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

    /**
     * Internal use only. This will always be null.
     */
    @JsonProperty("SeasonId")
    private String seasonId;

}
