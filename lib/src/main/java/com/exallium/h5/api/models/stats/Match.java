package com.exallium.h5.api.models.stats;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties({"Links"})
public class Match {

    public static class Id {
        /**
         * The ID for this match. More match details are available via the applicable
         * Post Game Carnage Report endpoint.
         */
        @JsonProperty("MatchId")
        private String matchId;

        /**
         * The game mode applicable to this match. Options are:
         *   Error = 0,
         *   Arena = 1,
         *   Campaign = 2,
         *   Custom = 3,
         *   Warzone = 4.
         */
        @JsonProperty("GameMode")
        private int gameMode;
    }

    public static class CompletedDate {
        @JsonProperty("ISO8601Date")
        private String date;
    }

    @JsonProperty("Id")
    private Id id;

    /**
     * The ID of the playlist (aka "Hopper") for the match.
     * Hoppers are used in Arena and Warzone. In Arena, they function just as you would
     * expect, similar to previous Halo titles. Warzone uses hoppers as well. There
     * will be multiple Warzone hoppers which contain a rotating playlist of scenarios
     * to play.
     * Null for campaign & custom games.
     * Playlists are available via the Metadata API.
     */
    @JsonProperty("HopperId")
    private String hopperId;

    /**
     * The ID of the base map for this match. Maps are available via the Metadata API.
     */
    @JsonProperty("MapId")
    private String mapId;

    /**
     * The variant of the map for this match. There are two sources of map variants:
     * official map variants available via the Metadata API and user-generated map
     * variants which are not available via the APIs currently. If the map variant for
     * this match was an official map variant, then the structure will be as documented
     * here. This will be null for campaign games.
     */
    @JsonProperty("MapVariant")
    private Resource mapVariant;

    /**
     * The ID of the game base variant for this match. Game base variants are available
     * via the Metadata API.
     */
    @JsonProperty("GameBaseVariantId")
    private String gameBaseVariantId;

    /**
     * The variant of the game for this match. There are two sources of game variants:
     * official game variants available via the Metadata API and user-generated game
     * variants which are not available via the APIs currently. If the game variant for
     * this match was an official game variant, then the structure will be as
     * documented here. This will be null for campaign games.
     */
    @JsonProperty("GameVariant")
    private Resource gameVariant;

    /**
     * The length of the match. This is expressed as an ISO 8601 Duration.
     */
    @JsonProperty("MatchDuration")
    private String matchDuration;

    /**
     * The date and time when match ended. Note that this is different than the
     * processing date, once matches end they typically take a small amount of time to
     * process. The processing date is not available through this API. The time
     * component of this date is always set to "00:00:00". This is expressed as an ISO
     * 8601 combined Date and Time.
     */
    @JsonProperty("MatchCompletedDate")
    private CompletedDate matchCompletedDate;

    /**
     * Provides team data. This list contains all team that Won or Tied. Losing teams
     * are not included. This list is empty for campaign games.
     */
    @JsonProperty("Teams")
    private List<Team> teams;

    /**
     * This field contains the player's data. This will only contain data for the
     * player specified in the request.
     */
    @JsonProperty("Players")
    private List<TeamPlayer> players;

    /**
     * Whether this was a team-based game or not (e.g. free-for-all).
     */
    @JsonProperty("IsTeamGame")
    private boolean isTeamGame;

    /**
     * Internal use only. This will always be null.
     */
    @JsonProperty("SeasonId")
    private String seasonId;

}
