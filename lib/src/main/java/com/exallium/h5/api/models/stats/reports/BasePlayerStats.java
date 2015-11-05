package com.exallium.h5.api.models.stats.reports;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties({"PreMatchRatings", "PostMatchRatings"})
public class BasePlayerStats {

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

        public List<StatCount> getMedalStatCounts() {
            return medalStatCounts;
        }

        public List<StatCount> getImpulseStatCounts() {
            return impulseStatCounts;
        }

        public List<Timelapse> getMedalTimelapses() {
            return medalTimelapses;
        }

        public List<Timelapse> getImpulseTimelapses() {
            return impulseTimelapses;
        }
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

        public String getId() {
            return id;
        }

        public int getCount() {
            return count;
        }
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

        public String getId() {
            return id;
        }

        public String getTimelapse() {
            return timelapse;
        }
    }

    public static class WeaponStats {

        @JsonProperty("WeaponId")
        private WeaponId weaponId;

        /**
         * The number of shots fired for this weapon.
         */
        @JsonProperty("TotalShotsFired")
        private int totalShotsFired;

        /**
         * The number of shots landed for this weapon.
         */
        @JsonProperty("TotalShotsLanded")
        private int totalShotsLanded;

        /**
         * The number of headshots for this weapon.
         */
        @JsonProperty("TotalHeadshots")
        private int totalHeadshots;

        /**
         * The number of kills for this weapon.
         */
        @JsonProperty("TotalKills")
        private int totalKills;

        /**
         * The total damage dealt for this weapon.
         */
        @JsonProperty("TotalDamageDealt")
        private double totalDamageDealt;

        /**
         * The total possession time for this weapon. This is expressed as an ISO 8601
         * Duration.
         */
        @JsonProperty("TotalPossessionTime")
        private String totalPossessionTime;

        public WeaponId getWeaponId() {
            return weaponId;
        }

        public int getTotalShotsFired() {
            return totalShotsFired;
        }

        public int getTotalShotsLanded() {
            return totalShotsLanded;
        }

        public int getTotalHeadshots() {
            return totalHeadshots;
        }

        public int getTotalKills() {
            return totalKills;
        }

        public double getTotalDamageDealt() {
            return totalDamageDealt;
        }

        public String getTotalPossessionTime() {
            return totalPossessionTime;
        }
    }

    public static class WeaponId {

        /**
         * The ID of the weapon. Weapons are available via the Metadata API.
         */
        @JsonProperty("StockId")
        private long stockId;

        /**
         * Any attachments the weapon had.
         */
        @JsonProperty("Attachments")
        private List<Integer> attachments;

        public long getStockId() {
            return stockId;
        }

        public List<Integer> getAttachments() {
            return attachments;
        }
    }

    public static class MedalAward {

        /**
         * The ID of the Medal. Medals are available via the Metadata API.
         */
        @JsonProperty("MedalId")
        private long medalId;

        /**
         * The number of times the Medal was earned.
         */
        @JsonProperty("Count")
        private int count;

        public long getMedalId() {
            return medalId;
        }

        public int getCount() {
            return count;
        }
    }

    public static class EnemyKill {

        /**
         * The enemy this entry references
         */
        @JsonProperty("Enemy")
        private Enemy enemy;

        /**
         * Total number of kills on the enemy by the player
         */
        @JsonProperty("TotalKills")
        private int kills;

        public Enemy getEnemy() {
            return enemy;
        }

        public int getKills() {
            return kills;
        }
    }

    public static class Enemy {
        /**
         * The Base ID for the enemy.
         */
        @JsonProperty("BaseId")
        private long baseId;

        /**
         * The attachments (variants) for the enemy.
         */
        @JsonProperty("Attachments")
        private List<Long> attachments;

        public long getBaseId() {
            return baseId;
        }

        public List<Long> getAttachments() {
            return attachments;
        }
    }

    public static class Impulse {

        /**
         * The ID of the Impulse. Impulses are available via the Metadata API.
         */
        @JsonProperty("Id")
        private long id;

        /**
         * The number of times the Impuse was earned.
         */
        @JsonProperty("Count")
        private int count;

        public long getId() {
            return id;
        }

        public int getCount() {
            return count;
        }
    }

    /**
     * The game base variant specific stats for this match. Flexible stats are
     * available via the Metadata API.
     */
    @JsonProperty("FlexibleStats")
    private FlexibleStats flexibleStats;

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
    private WeaponStats weapon;

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
    private List<EnemyKill> destroyedEnemyVehicles;

    /**
     * List of enemies killed, per enemy type. Enemies are available via the Metadata
     * API.
     */
    @JsonProperty("EnemyKills")
    private List<EnemyKill> enemyKills;

    /**
     * The set of weapons (weapons and vehicles included) used by the player.
     */
    @JsonProperty("WeaponStats")
    private List<WeaponStats> weapons;

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

    public FlexibleStats getFlexibleStats() {
        return flexibleStats;
    }

    public Player getPlayer() {
        return player;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getRank() {
        return rank;
    }

    public boolean isDnf() {
        return dnf;
    }

    public String getAvgLifeTimeOfPlayer() {
        return avgLifeTimeOfPlayer;
    }

    public int getTotalKills() {
        return totalKills;
    }

    public int getTotalHeadshots() {
        return totalHeadshots;
    }

    public int getTotalWeaponDamage() {
        return totalWeaponDamage;
    }

    public int getTotalShotsFired() {
        return totalShotsFired;
    }

    public int getTotalShotsLanded() {
        return totalShotsLanded;
    }

    public WeaponStats getWeapon() {
        return weapon;
    }

    public int getTotalMeleeKills() {
        return totalMeleeKills;
    }

    public double getTotalMeleDamage() {
        return totalMeleDamage;
    }

    public int getTotalAssassinations() {
        return totalAssassinations;
    }

    public int getTotalGroundPoundKills() {
        return totalGroundPoundKills;
    }

    public double getTotalGroundPoundDamage() {
        return totalGroundPoundDamage;
    }

    public int getTotalShoulderBashKills() {
        return totalShoulderBashKills;
    }

    public double getTotalShoulderBashDamage() {
        return totalShoulderBashDamage;
    }

    public double getTotalGrenadeDamage() {
        return totalGrenadeDamage;
    }

    public int getTotalPowerWeaponKills() {
        return totalPowerWeaponKills;
    }

    public double getTotalPowerWeaponDamage() {
        return totalPowerWeaponDamage;
    }

    public int getTotalPowerWeaponGrabs() {
        return totalPowerWeaponGrabs;
    }

    public String getTotalPowerWeaponPossessionTime() {
        return totalPowerWeaponPossessionTime;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    public int getTotalAssists() {
        return totalAssists;
    }

    public int getTotalGamesCompleted() {
        return totalGamesCompleted;
    }

    public int getTotalGamesWon() {
        return totalGamesWon;
    }

    public int getTotalGamesLost() {
        return totalGamesLost;
    }

    public int getTotalGamesTied() {
        return totalGamesTied;
    }

    public String getTotalTimePlayed() {
        return totalTimePlayed;
    }

    public int getTotalGrenadeKills() {
        return totalGrenadeKills;
    }

    public List<MedalAward> getMedalAwards() {
        return medalAwards;
    }

    public List<EnemyKill> getDestroyedEnemyVehicles() {
        return destroyedEnemyVehicles;
    }

    public List<EnemyKill> getEnemyKills() {
        return enemyKills;
    }

    public List<WeaponStats> getWeapons() {
        return weapons;
    }

    public List<Impulse> getImpulses() {
        return impulses;
    }

    public int getTotalSpartanKills() {
        return totalSpartanKills;
    }
}
