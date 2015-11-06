package com.exallium.h5.api.models.stats.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnemyKill {

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
