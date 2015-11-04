package com.exallium.h5.api.models.metadata;

import java.util.List;

public class Reward {

    // The amount of XP that will be awarded.
    private int xp;

    // The set of requisition packs (if any) that will be rewarded
    private List<RequisitionPack> requisitionPacks;

    // The id that identifies this reward
    private String id;

    // Internal Use only. Do Not Use.
    private String contentId;
}
