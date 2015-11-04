package com.exallium.h5.api.models.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamPlayer {

    @JsonProperty("Player")
    private Player player;

    /**
     * The ID of the team that the player was on when the match ended. Zero for
     * campaign games.
     */
    @JsonProperty("TeamId")
    private int teamId;

    /**
     * The player's team-agnostic ranking in this match.
     */
    @JsonProperty("Rank")
    private int rank;

    /**
     * Indicates what result the player received at the conclusion of the match.
     * Options are:
     *   Did Not Finish = 0,
     *   Lost = 1,
     *   Tied = 2,
     *   Won = 3.
     * Did Not Finish: The player was not present when the match ended.
     * Lost: The player was on a team that was assigned a loss, typically this is
     * when a team does not have rank = 1.
     * Won: The player was on the team that was assigned the win, typically this is
     * the team that has rank = 1.
     * Tied: The player was on the team that was awarded a tie. Typically this is
     * when the player is on the team with rank = 1, and there is at least one
     * other team with rank = 1. Ties are only for rank = 1 teams. Consider the
     * scenario when exactly one team is rank = 1, and two teams are rank = 2.
     * Players on the rank=1 team will have "Won", players on the rank = 2 teams
     * will have "Lost". For ties, this documentation states 'typically' because
     * the game may have unique rules for multi-team and FFA scenarios, in which
     * multiple teams are awarded a win.
     */
    @JsonProperty("Result")
    private int result;

    /**
     * The number of enemy kills the player had during this match. This includes
     * other Spartans and Enemy AI.
     */
    @JsonProperty("TotalKills")
    private int totalKills;

    /**
     * The number of times this player died during the match.
     */
    @JsonProperty("TotalDeaths")
    private int totalDeaths;

    /**
     * The number of assists credited to the player during the match. This includes
     * other Spartans and Enemy AI.
     */
    @JsonProperty("TotalAssists")
    private int totalAssists;

    /**
     * Internal use only. This will always be null.
     */
    @JsonProperty("PreMatchRatings")
    private String preMatchRatings;

    /**
     * Internal use only. This will always be null.
     */
    @JsonProperty("PostMatchRatings")
    private String postMatchRatings;
}
