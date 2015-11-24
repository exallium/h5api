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
    private long score;

    /**
     * The team's rank at the end of the match.
     */
    @JsonProperty("Rank")
    private int rank;

    public int getId() {
        return id;
    }

    public long getScore() {
        return score;
    }

    public int getRank() {
        return rank;
    }
}
