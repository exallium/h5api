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
