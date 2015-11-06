package com.exallium.h5.api.models.stats.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeaponId {

    /**
     * The ID of the weapon. Weapons are available via the Metadata API.
     */
    @JsonProperty("StockId")
    private long stockId;

    /**
     * Any attachments the weapon had.
     */
    @JsonProperty("Attachments")
    private List<Integer> attachments;

    public long getStockId() {
        return stockId;
    }

    public List<Integer> getAttachments() {
        return attachments;
    }
}
