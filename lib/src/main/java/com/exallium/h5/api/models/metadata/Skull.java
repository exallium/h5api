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

public class Skull {

    /**
     * A localized name, suitable for display to users. The text is title cased.
     */
    private String name;

    /**
     * A localized description, suitable for display to users.
     */
    private String description;

    /**
     * Indicates what mission this skull can be located within. Null when the skull is
     * not found in a mission. Missions are available via the Metadata API.
     */
    private String missionId;

    /**
     * URL Path for Skull
     */
    private String imageUrl;

    /**
     * The ID that uniquely identifies this skull.
     */
    private long id;

    /**
     * Internal use only. Do not use.
     */
    @JsonProperty("contentId")
    private String contentId;

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getMissionId() {
        return missionId;
    }

    public long getId() {
        return id;
    }
}
