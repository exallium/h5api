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

import com.exallium.h5.api.models.stats.common.Csr;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ArenaPlayerStats extends SpartanRankedPlayerStats {

    /**
     * The Competitive Skill Ranking (Csr) of the player before the match started. If
     * the player is still in measurement matches, this field is null. If the player
     * finished the last measurement match this match, this field is still null.
     */
    @JsonProperty("PreviousCsr")
    private Csr previousCsr;

    /**
     * The Competitive Skill Ranking (Csr) of the player after the match ended. If the
     * player is still in measurement matches, this field is null.
     */
    @JsonProperty("CurrentCsr")
    private Csr currentCsr;

    /**
     * The player's measurement matches left. If this field is greater than zero, then
     * the player will not have a Csr yet. If the player finished the match, this match
     * is included in this count.
     */
    @JsonProperty("MeasurementMatchesLeft")
    private int measurementMatchesLeft;

    public Csr getPreviousCsr() {
        return previousCsr;
    }

    public Csr getCurrentCsr() {
        return currentCsr;
    }

    public int getMeasurementMatchesLeft() {
        return measurementMatchesLeft;
    }
}
