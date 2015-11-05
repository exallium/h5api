package com.exallium.h5.api.models.stats.reports;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Team {
    /**
     * The ID for the team. The team's ID dictates the team's color. Team colors
     * are available via the Metadata API.
     */
    @JsonProperty("Id")
    private int id;

    /**
     * The team's score at the end of the match. The way the score is determined is
     * based off the game base variant being played:
     *   Breakout = number of rounds won,
     *   CTF = number of flag captures,
     *   Slayer = number of kills,
     *   Strongholds = number of points,
     *   Warzone = number of points.
     */
    @JsonProperty("Score")
    private int score;

    /**
     * The team's rank at the end of the match.
     */
    @JsonProperty("Rank")
    private int rank;

}
