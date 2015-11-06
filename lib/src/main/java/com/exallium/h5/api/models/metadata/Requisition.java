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

import java.util.List;

public class Requisition {
    /**
     * This lists all the game modes that this requisition is redeemable in. Options are:
     *   - Arena
     *   - Campaign
     *   - Custom
     *   - Warzone
     */
    private List<String> supportedGameModes;

    /**
     * A localized name, suitable for display to users. The text is title cased.
     */
    private String name;

    /**
     * A localized description, suitable for display to users.
     */
    private String description;

    /**
     * The non-localized rarity. Indicates the scarcity and thus rarity of the
     * requisition. The options are (in increasing order of rarity):
     *   - Common
     *   - Uncommon
     *   - Rare
     *   - UltraRare
     *   - Legendary
     */
    private String rarityType;

    /**
     * The localized rarity suitable for display to users. Indicates the scarcity and
     * thus rarity of the requisition
     */
    private String rarity;

    /**
     * Indicates if this requisition has been flagged as having 'mythic status'.
     */
    private boolean isMythic;

    /**
     * Indicates if this item is a Certification. Certifications will always be durable
     * and are required to earn certain other requisitions.
     */
    private boolean isCertification;

    /**
     * Indicates whether the requisition is wearable.
     */
    private boolean isWearable;

    /**
     * Indicates how the requisition card may be used. Options are:
     *   - Consumable
     *   - Durable
     *   - Boost
     *   - CreditGranting
     * Consumable: The requisition can be called in and used while in-game. When players
     * call in a consumable requisition it is removed from the players inventory.
     * Durable: The requisition is not usable in-game. Players can only earn one of each
     * durable requisition and it is used to model awards such as armor suits, helmets,
     * emblems or other items such as stickers. Durables are never removed from the
     * player inventory.
     * Boost: The requisition is used prior to a match beginning and will modify how many
     * XP or Credits the player will earn at the end of the match. When put into effect,
     * it is removed from the player inventory.
     * Credit Granting: When obtained, the requisition will grant the player some amount
     * of credits. Once the credits are granted the requisition is immediately removed
     * from the player inventory.
     */
    private String useType;

    /**
     * A reference to a large image for icon use. This may be null if there is no image
     * defined.
     */
    private String largeImageUrl;

    /**
     * A reference to a medium image for icon use. This may be null if there is no image
     * defined.
     */
    private String mediumImageUrl;

    /**
     * A reference to a small image for icon use. This may be null if there is no image
     * defined.
     */
    private String smallImageUrl;

    /**
     * A localized name for the category of the requisition, suitable for display to
     * users. The text is title cased.
     */
    private String categoryName;

    /**
     * Internal use. A non-localized name for the category of the requisition.
     */
    private String internalCategoryName;

    /**
     * A localized name for the sub-category of the requisition, suitable for display to
     * users. The text is title cased.
     */
    private String subcategoryName;

    /**
     * The order of the subcategory in the category.
     */
    private int subcategoryOrder;

    /**
     * This field indicates how many credits the player will receive if they wish to
     * discard this requisition. When SellPrice is zero, the card cannot be sold back for
     * credits.
     */
    private int sellPrice;

    /**
     * The Spartan Rank required in order to use the requisition.
     */
    private int levelRequirement;

    /**
     * For requisitions where the useType is CreditGranting, this field indicates how
     * many credits the player is rewarded with. When the requisition is not
     * CreditGranting, this value is zero.
     */
    private int creditsAwarded;

    /**
     * If this is set, this is the ID of the Certification Requisition that is required
     * to earn this requisition.
     */
    private String certificationRequisitionId;

    /**
     * The ID that uniquely identifies this requisition.
     */
    private String id;

    /**
     * Internal use only. Do not use.
     */
    @JsonProperty("contentId")
    private String contentId;

    public List<String> getSupportedGameModes() {
        return supportedGameModes;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRarityType() {
        return rarityType;
    }

    public String getRarity() {
        return rarity;
    }

    public boolean isMythic() {
        return isMythic;
    }

    public boolean isCertification() {
        return isCertification;
    }

    public boolean isWearable() {
        return isWearable;
    }

    public String getUseType() {
        return useType;
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

    public String getCategoryName() {
        return categoryName;
    }

    public String getInternalCategoryName() {
        return internalCategoryName;
    }

    public String getSubcategoryName() {
        return subcategoryName;
    }

    public int getSubcategoryOrder() {
        return subcategoryOrder;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getLevelRequirement() {
        return levelRequirement;
    }

    public int getCreditsAwarded() {
        return creditsAwarded;
    }

    public String getCertificationRequisitionId() {
        return certificationRequisitionId;
    }

    public String getId() {
        return id;
    }
}
