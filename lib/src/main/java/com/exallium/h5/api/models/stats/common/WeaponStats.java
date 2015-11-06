package com.exallium.h5.api.models.stats.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ahart on 2015-11-06.
 */
public class WeaponStats {

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
