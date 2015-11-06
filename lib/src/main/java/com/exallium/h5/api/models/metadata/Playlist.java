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

package com.exallium.h5.api.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

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
     * Indicates if a Csr (competitive skill rank) is shown for players who participate
     * in this playlist.
     */
    @JsonProperty("isRanked")
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
    @JsonProperty("isActive")
    private boolean isActive;

    /**
     * The ID that uniquely identifies this playlist.
     */
    private String id;

    /**
     * Internal use only. Do not use.
     */
    @JsonProperty("contentId")
    private String contentId;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isRanked() {
        return isRanked;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getGameMode() {
        return gameMode;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getId() {
        return id;
    }
}
