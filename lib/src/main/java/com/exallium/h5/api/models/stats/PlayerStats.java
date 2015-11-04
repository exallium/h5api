package com.exallium.h5.api.models.stats;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PlayerStats {

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
    }

    public static class CSR {
        /**
         * The CSR tier.
         */
        @JsonProperty("Tier")
        private int tier;

        /**
         * The Designation of the CSR. Options are:
         * 1 through 5: Normal designations
         * 6 and 7: Semi-pro and Pro respectively
         */
        @JsonProperty("DesignationId")
        private int designationId;

        /**
         * The CSR value. Zero for normal designations.
         */
        @JsonProperty("Csr")
        private int csr;

        /**
         * The percentage of progress towards the next CSR tier.
         */
        @JsonProperty("PercentToNextTier")
        private int percentToNextTier;

        /**
         * If the CSR is Semi-pro or Pro, the player's leaderboard ranking.
         */
        @JsonProperty("Rank")
        private int rank;
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
    }

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

    public static class FlexibleStats {
        /**
         * The set of flexible stats that are derived from medal events.
         */
        @JsonProperty("MedalStatCounts")
        private List<StatCount> medalStatCounts;

        /**
         * The set of flexible stats that are derived from impulse events.
         */
        @JsonProperty("ImpulseStatCounts")
        private List<StatCount> impulseStatCounts;

        /**
         * The set of flexible stats that are derived from medal time lapses.
         */
        @JsonProperty("MedalTimelapses")
        private List<Timelapse> medalTimelapses;

        /**
         * The set of flexible stats that are derived from impulse time lapses.
         */
        @JsonProperty("ImpulseTimelapses")
        private List<Timelapse> impulseTimelapses;

    }

    public static class StatCount {
        /**
         * The ID of the flexible stat.
         */
        @JsonProperty("Id")
        private String id;

        /**
         * The number of times this flexible stat was earned.
         */
        @JsonProperty("Count")
        private int count;
    }

    public static class Timelapse {
        /**
         * The ID of the flexible stat.
         */
        @JsonProperty("Id")
        private String id;

        /**
         * The amount of time the flexible stat was earned for. This is expressed as
         * an ISO 8601 Duration.
         */
        @JsonProperty("Timelapse")
        private String timelapse;
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
    }

    public static class MetaCommendationDelta {

    }

    public static class ProgressiveCommendationDelta {

    }

    public static class Weapon {

    }

    public static class WeaponId {

    }

    public static class MedalAward {

    }

    public static class Enemy {

    }

    public static class Impulse {

    }

    /**
     * The experience information for the player in this match.
     */
    @JsonProperty("XpInfo")
    private XpInfo xpInfo;

    /**
     * The Competitive Skill Ranking (CSR) of the player before the match started. If
     * the player is still in measurement matches, this field is null. If the player
     * finished the last measurement match this match, this field is still null.
     */
    @JsonProperty("PreviousCSR")
    private CSR previousCSR;

    /**
     * The Competitive Skill Ranking (CSR) of the player after the match ended. If the
     * player is still in measurement matches, this field is null.
     */
    @JsonProperty("CurrentCSR")
    private CSR currentCSR;

    /**
     * The player's measurement matches left. If this field is greater than zero, then
     * the player will not have a CSR yet. If the player finished the match, this match
     * is included in this count.
     */
    @JsonProperty("MeasurementMatchesLeft")
    private int measurementMatchesLeft;

    /**
     * The set of rewards that the player got in this match.
     */
    @JsonProperty("RewardSets")
    private List<RewardSet> rewardSets;

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

    /**
     * The game base variant specific stats for this match. Flexible stats are
     * available via the Metadata API.
     */
    @JsonProperty("FlexibleStats")
    private FlexibleStats flexibleStats;

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

    @JsonProperty("Player")
    private Player player;

    /**
     * The ID of the team that the player was on when the match ended.
     */
    @JsonProperty("TeamId")
    private int teamId;

    /**
     * The player's team-agnostic ranking.
     */
    @JsonProperty("Rank")
    private int rank;

    /**
     * Indicates whether the player was present in the match when it ended.
     */
    @JsonProperty("DNF")
    private boolean dnf;

    /**
     * The player's average lifetime.
     */
    @JsonProperty("AvgLifeTimeOfPlayer")
    private String avgLifeTimeOfPlayer;

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

    /**
     * Total number of kills done by the player. This includes melee kills, shoulder
     * bash kills and Spartan charge kills, all power weapons, AI kills and vehicle
     * destructions.
     */
    @JsonProperty("TotalKills")
    private int totalKills;

    /**
     * Total number of headshots done by the player.
     */
    @JsonProperty("TotalHeadshots")
    private int totalHeadshots;

    /**
     * Total weapon damage dealt by the player.
     */
    @JsonProperty("TotalWeaponDamage")
    private int totalWeaponDamage;

    /**
     * Total number of shots fired by the player.
     */
    @JsonProperty("TotalShotsFired")
    private int totalShotsFired;

    /**
     * Total number of shots landed by the player.
     */
    @JsonProperty("TotalShotsLanded")
    private int totalShotsLanded;

    /**
     * The weapon the player used to get the most kills this match.
     */
    @JsonProperty("WeaponWithMostKills")
    private Weapon weapon;

    /**
     * Total number of melee kills by the player.
     */
    @JsonProperty("TotalMeleeKills")
    private int totalMeleeKills;

    /**
     * Total melee damage dealt by the player.
     */
    @JsonProperty("TotalMeleeDamage")
    private double totalMeleDamage;

    /**
     * Total number of assassinations by the player.
     */
    @JsonProperty("TotalAssassinations")
    private int totalAssassinations;

    /**
     * Total number of ground pound kills by the player.
     */
    @JsonProperty("TotalGroundPoundKills")
    private int totalGroundPoundKills;

    /**
     * Total ground pound damage dealt by the player.
     */
    @JsonProperty("TotalGroundPoundDamage")
    private double totalGroundPoundDamage;

    /**
     * Total number of shoulder bash kills by the player.
     */
    @JsonProperty("TotalShoulderBashKills")
    private int totalShoulderBashKills;

    /**
     * Total shoulder bash damage dealt by the player.
     */
    @JsonProperty("TotalShoulderBashDamage")
    private double totalShoulderBashDamage;

    /**
     * Total grenade damage dealt by the player.
     */
    @JsonProperty("TotalGrenadeDamage")
    private double totalGrenadeDamage;

    /**
     * Total number of power weapon kills by the player.
     */
    @JsonProperty("TotalPowerWeaponKills")
    private int totalPowerWeaponKills;

    /**
     * Total power weapon damage dealt by the player.
     */
    @JsonProperty("TotalPowerWeaponDamage")
    private double totalPowerWeaponDamage;

    /**
     * Total number of power weapon grabs by the player.
     */
    @JsonProperty("TotalPowerWeaponGrabs")
    private int totalPowerWeaponGrabs;

    /**
     * Total power weapon possession by the player. This is expressed as an ISO 8601
     * Duration.
     */
    @JsonProperty("TotalPowerWeaponPossessionTime")
    private String totalPowerWeaponPossessionTime;

    /**
     * Total number of deaths by the player.
     */
    @JsonProperty("TotalDeaths")
    private int totalDeaths;

    /**
     * Total number of assists by the player.
     */
    @JsonProperty("TotalAssists")
    private int totalAssists;

    /**
     * Not used.
     */
    @JsonProperty("TotalGamesCompleted")
    private int totalGamesCompleted;

    /**
     * Not used.
     */
    @JsonProperty("TotalGamesWon")
    private int totalGamesWon;

    /**
     * Not used.
     */
    @JsonProperty("TotalGamesLost")
    private int totalGamesLost;

    /**
     * Not used.
     */
    @JsonProperty("TotalGamesTied")
    private int totalGamesTied;

    /**
     * Total timed played in this match by the player.
     */
    @JsonProperty("TotalTimePlayed")
    private String totalTimePlayed;

    /**
     * Total number of grenade kills by the player.
     */
    @JsonProperty("TotalGrenadeKills")
    private int totalGrenadeKills;

    /**
     * The set of Medals earned by the player.
     */
    @JsonProperty("MedalAwards")
    private List<MedalAward> medalAwards;

    /**
     * List of enemy vehicles destroyed. Vehicles are available via the Metadata API.
     * Note: this stat measures enemy vehicles, not any vehicle destruction.
     */
    @JsonProperty("DestroyedEnemyVehicles")
    private List<Enemy> destroyedEnemyVehicles;

    /**
     * List of enemies killed, per enemy type. Enemies are available via the Metadata
     * API.
     */
    @JsonProperty("EnemyKills")
    private List<Enemy> enemyKills;

    /**
     * The set of weapons (weapons and vehicles included) used by the player.
     */
    @JsonProperty("WeaponStats")
    private List<Weapon> weaponStats;

    /**
     * The set of Impulses (invisible Medals) earned by the player.
     */
    @JsonProperty("Impulses")
    private List<Impulse> impulses;

    /**
     * Total number of Spartan kills by the player.
     */
    @JsonProperty("TotalSpartanKills")
    private int totalSpartanKills;
}
