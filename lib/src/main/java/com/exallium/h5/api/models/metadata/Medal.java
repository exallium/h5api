package com.exallium.h5.api.models.metadata;

public class Medal {

    /**
     * A localized name for the medal, suitable for display to users.
     */
    private String name;

    /**
     * A localized description, suitable for display to users.
     */
    private String description;

    /**
     * The type of this medal. It will be one of the following options:
     *   - Unknown
     *   - Multi-kill
     *   - Spree
     *   - Style
     *   - Vehicle
     *   - Breakout
     *   - Objective
     */
    private String classification;

    /**
     * The anticipated difficulty, relative to all other medals of this classification.
     * The difficulty is ordered from easiest to most difficult.
     */
    private int difficulty;

    /**
     * The location on the sprite sheet for the medal.
     */
    private SpriteLocation spriteLocation;

    /**
     * The ID that uniquely identifies this map medal.
     */
    private int id;

    /**
     * Internal use only. Do not use.
     */
    private String contentId;
}
