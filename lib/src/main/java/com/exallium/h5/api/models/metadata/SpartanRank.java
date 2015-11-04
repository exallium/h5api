package com.exallium.h5.api.models.metadata;

public class SpartanRank {

    /**
     * The amount of XP required to enter this rank.
     */
    private int startXp;

    /**
     * The reward the player will receive for earning this Spartan Rank.
     */
    private Reward reward;

    /**
     * The ID that uniquely identifies this Spartan Rank.
     */
    private int id;

    /**
     * Internal use only. Do not use.
     */
    private String contentId;
}
