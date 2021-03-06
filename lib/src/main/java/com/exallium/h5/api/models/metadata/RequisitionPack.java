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

public class RequisitionPack {
    /**
     * A localized name for the pack, suitable for display to users. The text
     * is title cased.
     */
    private String name;

    /**
     * A localized description, suitable for display to users.
     */
    private String description;

    /**
     * A large image for the pack.
     */
    private String largeImageUrl;

    /**
     * A medium image for the pack.
     */
    private String mediumImageUrl;

    /**
     * A small image for the pack.
     */
    private String smallImageUrl;

    /**
     * Internal use. Whether the item should be featured ahead of others.
     */
    @JsonProperty("isFeatured")
    private boolean isFeatured;

    /**
     * Internal use. Whether the item should be labeled as "new!"
     */
    @JsonProperty("isNew")
    private boolean isNew;

    /**
     * If the pack is purchasable via credits, this value contains the number
     * of credits a player must spend to acquire one pack. This value is zero
     * when isPurchasableWithCredits is false.
     */
    private int creditPrice;

    /**
     * If the pack is currently available for purchase by spending credits,
     * then this value is true.
     */
    @JsonProperty("isPurchasableWithCredits")
    private boolean isPurchasableWithCredits;

    /**
     * If the pack might be obtainable through the Xbox Live Marketplace, then
     * this value is true.
     */
    @JsonProperty("isPurchasableFromMarketplace")
    private boolean isPurchasableFromMarketplace;

    /**
     * If this pack might be obtainable through the Xbox Live Marketplace, this
     * is the product ID. Note: Pricing and availability within the Xbox Live
     * marketplace is controlled independently of this value. The presence of
     * an Id in this field is not a guarantee the product is purchasable. There
     * may be geographic restrictions restricting purchase in certain regions,
     * or the item may not be currently purchasable at all.
     */
    private String xboxMarketplaceProductId;

    /**
     * If this pack might be obtainable through the Xbox Live Marketplace, this
     * is the URL to the product.
     */
    private String xboxMarketplaceProductUrl;

    /**
     * Internal use. The order in which packs are shown for merchandising
     * purposes.
     */
    private int merchandisingOrder;

    /**
     * Internal use. Indicates the visual treatment of the pack. This is one of
     * the following options:
     *   - None
     *   - New
     *   - Hot
     *   - LeavingSoon
     *   - MaximumValue
     *   - Limitedtime
     *   - Featured
     *   - BestSeller
     *   - Popular
     */
    private String flair;

    /**
     * The ID that uniquely identifies this pack.
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

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

    public boolean isNew() {
        return isNew;
    }

    public int getCreditPrice() {
        return creditPrice;
    }

    public boolean isPurchasableWithCredits() {
        return isPurchasableWithCredits;
    }

    public boolean isPurchasableFromMarketplace() {
        return isPurchasableFromMarketplace;
    }

    public String getXboxMarketplaceProductId() {
        return xboxMarketplaceProductId;
    }

    public String getXboxMarketplaceProductUrl() {
        return xboxMarketplaceProductUrl;
    }

    public int getMerchandisingOrder() {
        return merchandisingOrder;
    }

    public String getFlair() {
        return flair;
    }

    public String getId() {
        return id;
    }
}
