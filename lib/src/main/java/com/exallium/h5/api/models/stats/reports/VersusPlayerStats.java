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

import java.util.List;

public class VersusPlayerStats extends BasePlayerStats {
    public static class OpponentDetails {
        /**
         * The gamertag of the opponent that was killed or killed the player.
         */
        @JsonProperty("GamerTag")
        private String gamertag;

        /**
         * The number of times that opponent was killed or killed the player.
         */
        @JsonProperty("TotalKills")
        private int totalKills;
    }

    /**
     * The number of times the player killed each opponent. If the player did not kill
     * an opponent, there will be no entry for that opponent.
     */
    @JsonProperty("KilledOpponentDetails")
    private List<OpponentDetails> killedOpponentDetails;

    /**
     * The number of times the player was killed by each opponent. If the player was
     * not killed by an opponent, there will be no entry for that opponent.
     */
    @JsonProperty("KilledByOpponentDetails")
    private List<OpponentDetails> killedByOpponentDetails;
}
