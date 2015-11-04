package com.exallium.h5.api.models.metadata;

public class Playlist {
    /**
     * A localized name for the playlist, suitable for display to users. The text is
     * title cased.
     */
    private String name;

    /**
     * A localized description for the playlist, suitable for display to users.
     */
    private String description;

    /**
     * Indicates if a CSR (competitive skill rank) is shown for players who participate
     * in this playlist.
     */
    private boolean isRanked;

    /**
     * An image used to illustrate this playlist.
     */
    private String imageUrl;

    /**
     * The game mode played in this playlist. Options are:
     *   - Arena
     *   - Campaign
     *   - Custom
     *   - Warzone
     */
    private String gameMode;

    /**
     * Indicates if this playlist is currently available for play.
     */
    private boolean isActive;

    /**
     * The ID that uniquely identifies this playlist.
     */
    private String id;

    /**
     * Internal use only. Do not use.
     */
    private String contentId;
}
