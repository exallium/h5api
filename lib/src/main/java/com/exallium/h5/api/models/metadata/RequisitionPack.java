package com.exallium.h5.api.models.metadata;

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
    private boolean isFeatured;

    /**
     * Internal use. Whether the item should be labeled as "new!"
     */
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
    private boolean isPurchasableWithCredits;

    /**
     * If the pack might be obtainable through the Xbox Live Marketplace, then
     * this value is true.
     */
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
    private String contentId;
}
