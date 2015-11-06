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

package com.exallium.h5.api.models.stats.servicerecords;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VariantRecord {
    /**
     * Rank between 1-3
     */
    @JsonProperty("GameBaseVariantRank")
    private int gameBaseVariantRank;

    /**
     * Number of games played in game base variant
     */
    @JsonProperty("NumberOfMatchesCompleted")
    private long numberOfMatchesCompleted;

    /**
     * Id of the game base variant
     */
    @JsonProperty("GameBaseVariantId")
    private String gameBaseVariantId;

    /**
     * Number of matches won on game base variant
     */
    @JsonProperty("NumberOfMatchesWon")
    private long numberOfMatchesWon;

    public int getGameBaseVariantRank() {
        return gameBaseVariantRank;
    }

    public long getNumberOfMatchesCompleted() {
        return numberOfMatchesCompleted;
    }

    public String getGameBaseVariantId() {
        return gameBaseVariantId;
    }

    public long getNumberOfMatchesWon() {
        return numberOfMatchesWon;
    }
}
