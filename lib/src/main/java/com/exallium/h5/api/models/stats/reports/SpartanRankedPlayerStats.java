package com.exallium.h5.api.models.stats.reports;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;
import java.util.List;

public class SpartanRankedPlayerStats extends VersusPlayerStats {

    public static class XpInfo {
        /**
         * The player's Spartan Rank before the match started.
         */
        @JsonProperty("PrevSpartanRank")
        private int prevSpartanRank;

        /**
         * The player's Spartan Rank after the match ended.
         */
        @JsonProperty("SpartanRank")
        private int spartanRank;

        /**
         * The player's XP before the match started.
         */
        @JsonProperty("PrevTotalXP")
        private int prevTotalXP;

        /**
         * The player's XP after the match ended.
         */
        @JsonProperty("TotalXP")
        private int totalXP;

        /**
         * The multiplier on the XP earned this match based on their Spartan Rank when
         * the match ended.
         */
        @JsonProperty("SpartanRankMatchXPScalar")
        private double spartanRankMatchXPScalar;

        /**
         * The portion of the XP the player earned this match that was based on how much
         * time was spent in-match.
         */
        @JsonProperty("PlayerTimePerformanceXPAward")
        private int playerTimePerformanceXPAward;

        /**
         * The XP awarded to the player based on how their team ranked when the match
         * concluded.
         */
        @JsonProperty("PerformanceXP")
        private int performanceXP;

        /**
         * The XP awarded to the player for their team-agnostic rank.
         */
        @JsonProperty("PlayerRankXPAward")
        private int playerRankXPAward;

        /**
         * The amount of XP the player earned if they played a boost card for this match,
         * and the boost card criteria was met. This is a fixed amount of XP, not a
         * multiplier.
         */
        @JsonProperty("BoostAmount")
        private int boostAmount;

        public int getPrevSpartanRank() {
            return prevSpartanRank;
        }

        public int getSpartanRank() {
            return spartanRank;
        }

        public int getPrevTotalXP() {
            return prevTotalXP;
        }

        public int getTotalXP() {
            return totalXP;
        }

        public double getSpartanRankMatchXPScalar() {
            return spartanRankMatchXPScalar;
        }

        public int getPlayerTimePerformanceXPAward() {
            return playerTimePerformanceXPAward;
        }

        public int getPerformanceXP() {
            return performanceXP;
        }

        public int getPlayerRankXPAward() {
            return playerRankXPAward;
        }

        public int getBoostAmount() {
            return boostAmount;
        }
    }

    public static class RewardSet {
        /**
         * The ID of the reward.
         */
        @JsonProperty("RewardSet")
        private String rewardSet;

        /** The source of the reward. Options are:
         * None = 0,
         * Meta Commendation = 1,
         * Progress Commendation = 2,
         * Spartan Rank = 3
         */
        @JsonProperty("RewardSourceType")
        private int rewardSourceType;

        /**
         * If the Reward Source is Spartan Rank, this value is set to the Spartan Rank
         * the player acquired that led to this reward being granted. Note: Unlike the
         * commendations fields in this structure, this is not the GUID to a Spartan
         * Rank content item. That's because the Spartan Rank content item itself does
         * not detail what specific Spartan Rank it pertains to - this information is
         * derived from the list of Spartan Ranks as a whole. Spartan Ranks are
         * available via the Metadata API.
         */
        @JsonProperty("SpartanRankSource")
        private int spartanRankSource;

        /**
         * If the Reward Source is a Commendation, this is the ID of the level of the
         * commendation that earned the reward.
         */
        @JsonProperty("CommendationLevelId")
        private String commendationLevelId;

        /**
         * If the Reward Source is a Meta Commendation or Progress Commendation, this
         * is the ID of the Meta Commendation or Progress Commendation, respectively,
         * that earned the reward. Commendations are available via the Metadata API.
         */
        @JsonProperty("CommendationSource")
        private String commendationSource;

        public String getRewardSet() {
            return rewardSet;
        }

        public int getRewardSourceType() {
            return rewardSourceType;
        }

        public int getSpartanRankSource() {
            return spartanRankSource;
        }

        public String getCommendationLevelId() {
            return commendationLevelId;
        }

        public String getCommendationSource() {
            return commendationSource;
        }
    }

    public static class CreditsEarned {
        /**
         * Indicates how the credits result was arrived at. Options are:
         * Credits Disabled In Playlist = 0,
         * Player Did Not Finish = 1,
         * Credits Earned = 2
         * Credits Disabled In Playlist: TotalCreditsEarned is zero because this playlist
         * has credits disabled.
         * Player Did Not Finish: Credits are enabled in this playlist, but
         * TotalCreditsEarned is zero because the player did not finish the match.
         * Credits Earned: Credits are enabled in this playlist and the player completed
         * the match, so the credits formula was successfully evaluated. The fields below
         * provide the client with the values used in the formula. Note: That if we used
         * one or more default values, we still return "NormalResult". The fields below
         * will confirm the actual values used.
         */
        @JsonProperty("Result")
        private int result;

        /**
         * The total number of credits the player earned from playing this match.
         */
        @JsonProperty("TotalCreditsEarned")
        private int totalCreditsEarned;

        /**
         * The scalar applied to the credits earned based on the player's Spartan Rank.
         */
        @JsonProperty("SpartanRankModifier")
        private double spartanRankModifier;

        /**
         * The portion of credits earned due to the player's team-agnostic rank in the
         * match.
         */
        @JsonProperty("PlayerRankAmount")
        private int playerRankAmount;

        /**
         * The portion of credits earned due to the time the player played in the match.
         */
        @JsonProperty("TimePlayedAmount")
        private double timePlayedAmount;

        /**
         * The portion of credits earned due to the boost card the user applied
         */
        @JsonProperty("BoostAmount")
        private int boostAmount;

        public int getResult() {
            return result;
        }

        public int getTotalCreditsEarned() {
            return totalCreditsEarned;
        }

        public double getSpartanRankModifier() {
            return spartanRankModifier;
        }

        public int getPlayerRankAmount() {
            return playerRankAmount;
        }

        public double getTimePlayedAmount() {
            return timePlayedAmount;
        }

        public int getBoostAmount() {
            return boostAmount;
        }
    }

    public static class MetaCommendationDelta {

        /**
         * The commendation ID. Commendations are available via the Metadata API.
         */
        @JsonProperty("Id")
        private String id;

        /**
         * The progress the player had made towards the commendation level before the
         * match.
         */
        @JsonProperty("PreviousMetRequirements")
        private List<DataHolder> previousMetaRequirements;

        /**
         * The progress the player had made towards the commendation level after the
         * match.
         */
        @JsonProperty("MetRequirements")
        private List<DataHolder> metRequirements;

        public String getId() {
            return id;
        }

        public List<DataHolder> getPreviousMetaRequirements() {
            return previousMetaRequirements;
        }

        public List<DataHolder> getMetRequirements() {
            return metRequirements;
        }
    }

    public static class DataHolder {
        @JsonProperty("Data1")
        private BigInteger data1;

        @JsonProperty("Data2")
        private BigInteger data2;

        @JsonProperty("Data3")
        private BigInteger data3;

        @JsonProperty("Data4")
        private BigInteger data4;

        public BigInteger getData1() {
            return data1;
        }

        public BigInteger getData2() {
            return data2;
        }

        public BigInteger getData3() {
            return data3;
        }

        public BigInteger getData4() {
            return data4;
        }
    }

    public static class ProgressiveCommendationDelta {

        /**
         * The commendation ID. Commendations are available via the Metadata API.
         */
        @JsonProperty("Id")
        private String id;

        /**
         * The progress the player had made towards the commendation level before the
         * match.
         */
        @JsonProperty("PreviousProgress")
        private int previousProgress;

        /**
         * The progress the player had made towards the commendation level after the
         * match.
         */
        @JsonProperty("Progress")
        private int progress;

        public String getId() {
            return id;
        }

        public int getPreviousProgress() {
            return previousProgress;
        }

        public int getProgress() {
            return progress;
        }
    }

    /**
     * The experience information for the player in this match.
     */
    @JsonProperty("XpInfo")
    private XpInfo xpInfo;

    /**
     * The set of rewards that the player got in this match.
     */
    @JsonProperty("RewardSets")
    private List<RewardSet> rewardSets;

    /**
     * Details on any credits the player may have earned from playing this match.
     */
    @JsonProperty("CreditsEarned")
    private CreditsEarned creditsEarned;

    /**
     * The player's progress towards meta commendations. Commendations that had no
     * progress earned this match will not be returned.
     */
    @JsonProperty("MetaCommendationDeltas")
    private List<MetaCommendationDelta> metaCommendationDeltas;

    /**
     * The player's progress towards progressive commendations. Commendations that had
     * no progress earned this match will not be returned.
     */
    @JsonProperty("ProgressiveCommendationDeltas")
    private List<ProgressiveCommendationDelta> progressiveCommendationDeltas;

    public XpInfo getXpInfo() {
        return xpInfo;
    }

    public List<RewardSet> getRewardSets() {
        return rewardSets;
    }

    public CreditsEarned getCreditsEarned() {
        return creditsEarned;
    }

    public List<MetaCommendationDelta> getMetaCommendationDeltas() {
        return metaCommendationDeltas;
    }

    public List<ProgressiveCommendationDelta> getProgressiveCommendationDeltas() {
        return progressiveCommendationDeltas;
    }
}
