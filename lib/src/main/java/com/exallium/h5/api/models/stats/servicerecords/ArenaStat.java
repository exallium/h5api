package com.exallium.h5.api.models.stats.servicerecords;

import com.exallium.h5.api.models.stats.common.BaseStats;
import com.exallium.h5.api.models.stats.common.CSR;
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
         * zero, then the player will not have a CSR yet.
         */
        @JsonProperty("MeasurementMatchesLeft")
        private int measurementMatchesLeft;

        /**
         * The highest Competitive Skill Ranking (CSR) achieved by the player. This
         * is included because a player's CSR can drop based on performance.
         */
        @JsonProperty("HighestCsr")
        private CSR highestCsr;

        /**
         * The current Competitive Skill Ranking (CSR) of the player.
         */
        @JsonProperty("Csr")
        private CSR csr;

        public String getPlaylistId() {
            return playlistId;
        }

        public int getMeasurementMatchesLeft() {
            return measurementMatchesLeft;
        }

        public CSR getHighestCsr() {
            return highestCsr;
        }

        public CSR getCsr() {
            return csr;
        }
    }

    public static class VariantRecord {
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

    /**
     * List of arena stats by playlist.
     */
    @JsonProperty("ArenaPlaylistStats")
    private List<ArenaPlaylistStats> arenaPlaylistStats;

    /**
     * The highest obtained CSR by the player in arena. If the player hasn't
     * finished measurement matches yet for any playlist, this value is null.
     */
    @JsonProperty("HighestCsrAttained")
    private CSR highestCsrAttained;

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
     * The ID for the playlist that pertains to the highest obtained CSR field. If
     * the CSR is null, so is this field.
     */
    @JsonProperty("HighestCsrPlaylistId")
    private String highestCsrPlaylistId;

    public List<ArenaPlaylistStats> getArenaPlaylistStats() {
        return arenaPlaylistStats;
    }

    public CSR getHighestCsrAttained() {
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
