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

import com.exallium.h5.api.models.stats.common.BaseStats;
import com.exallium.h5.api.models.stats.common.Csr;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ArenaStat extends BaseStats {

    public static class ArenaPlaylistStats extends BaseStats {
        /**
         * The playlist ID. Playlists are available via the Metadata API.
         */
        @JsonProperty("PlaylistId")
        private String playlistId;

        /**
         * The player's measurement matches left. If this field is greater than
         * zero, then the player will not have a Csr yet.
         */
        @JsonProperty("MeasurementMatchesLeft")
        private int measurementMatchesLeft;

        /**
         * The highest Competitive Skill Ranking (Csr) achieved by the player. This
         * is included because a player's Csr can drop based on performance.
         */
        @JsonProperty("HighestCsr")
        private Csr highestCsr;

        /**
         * The current Competitive Skill Ranking (Csr) of the player.
         */
        @JsonProperty("Csr")
        private Csr csr;

        public String getPlaylistId() {
            return playlistId;
        }

        public int getMeasurementMatchesLeft() {
            return measurementMatchesLeft;
        }

        public Csr getHighestCsr() {
            return highestCsr;
        }

        public Csr getCsr() {
            return csr;
        }
    }

    /**
     * List of arena stats by playlist.
     */
    @JsonProperty("ArenaPlaylistStats")
    private List<ArenaPlaylistStats> arenaPlaylistStats;

    /**
     * The highest obtained Csr by the player in arena. If the player hasn't
     * finished measurement matches yet for any playlist, this value is null.
     */
    @JsonProperty("HighestCsrAttained")
    private Csr highestCsrAttained;

    /**
     * List of arena stats by GameBaseVariant
     */
    @JsonProperty("ArenaGameBaseVariantStats")
    private List<GameBaseVariantStats> arenaGameBaseVariantStats;

    /**
     * A list of up to 3 game base variants with the highest win rate by the user.
     * If there is a tie, the one with more completions is higher. If there's still
     * a tie, the GUIDs are sorted and selected.
     */
    @JsonProperty("TopGameBaseVariants")
    private List<VariantRecord> topGameBaseVariants;

    /**
     * The ID for the playlist that pertains to the highest obtained Csr field. If
     * the Csr is null, so is this field.
     */
    @JsonProperty("HighestCsrPlaylistId")
    private String highestCsrPlaylistId;

    public List<ArenaPlaylistStats> getArenaPlaylistStats() {
        return arenaPlaylistStats;
    }

    public Csr getHighestCsrAttained() {
        return highestCsrAttained;
    }

    public List<GameBaseVariantStats> getArenaGameBaseVariantStats() {
        return arenaGameBaseVariantStats;
    }

    public List<VariantRecord> getTopGameBaseVariants() {
        return topGameBaseVariants;
    }

    public String getHighestCsrPlaylistId() {
        return highestCsrPlaylistId;
    }
}
