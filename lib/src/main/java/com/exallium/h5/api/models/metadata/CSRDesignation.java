package com.exallium.h5.api.models.metadata;

import java.util.List;

public class CSRDesignation {
    /**
     * A localized name for the designation, suitable for display to users. The text is
     * title cased.
     */
    private String name;

    /**
     * An image to use as the background for the designation.
     */
    private String bannerImageUrl;

    /**
     * An array of "CSR Tier" entries, one for each tier this designation supports.
     * Semi-Pro and Pro will not have tiers defined, and this list will be empty.
     */
    private List<CSRTier> tiers;

    /**
     * An ID that identifies the designation. It happens to be the same as the
     * designation ordering. This value is the same across all languages. Note that Id =
     * 0 indicates the player has an "Unranked" designation. The player must complete
     * additional matches before being assigned an official CSR designation.
     */
    private int id;

    /**
     * Internal use only. Do not use.
     */
    private String contentId;
}
