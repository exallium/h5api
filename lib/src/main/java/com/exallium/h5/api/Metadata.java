package com.exallium.h5.api;

import com.exallium.h5.api.models.metadata.*;
import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

import java.util.List;

public interface Metadata {

    String PATH_PREFIX = "/metadata/h5/metadata/";

    /**
     * @return A listing of campaign missions supported in the title. There is no significance to the
     * ordering.
     */
    @GET(PATH_PREFIX + "campaign-missions")
    Observable<List<CampaignMission>> getCampaignMissions();

    /**
     * @return A list of commendations for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "commendations")
    Observable<List<Commendation>> getCommendations();

    /**
     * A list of CSR designations for the title. CSR stands for Competitive Skill Rank. CSR
     * is organized into a series of designations, each with a set of tiers within the
     * designation. The designations are: Iron, Bronze, Silver, Gold, Onyx, and Pro. Within
     * each designation are tiers, for example, Bronze 1, Bronze 2, Bronze 3, etc. The Pro
     * designation is special. It has only one tier. For Pro players, we show users a ranking
     * value instead of the tier indicator. For non-Pro players, we keep the absolute skill
     * ranking hidden and show the CSR tier. To determine what CSR a player has earned, view
     * the Service Record stats for that player. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "csr-designations")
    Observable<List<CSRDesignation>> getCSRDesignations();

    /**
     * @return A list of enemies for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "enemies")
    Observable<List<Enemy>> getEnemies();

    /**
     * @return A list of defined flexible stat entries for the title. There is no significance to the
     * ordering.
     */
    @GET(PATH_PREFIX + "flexible-stats")
    Observable<List<FlexibleStat>> getFlexibleStats();

    /**
     * @return A list of game base variants for the title. There is no mechanism to determine which
     * game base variants are currently available for play. To determine which game base
     * variants a specific player has played, view the Service Record stats for that
     * player.There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "game-base-variants")
    Observable<List<GameBaseVariant>> getGameBaseVariants();

    /**
     * @return A list of game variants for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "game-variants")
    Observable<List<GameVariant>> getGameVariants();

    /**
     * @return A list of impulses (essentially invisible medals) for the title. There is no
     * significance to the ordering.
     */
    @GET(PATH_PREFIX + "impulses")
    Observable<List<GameVariant>> getImpulses();

    /**
     * @param id Unique Map Variant ID
     * @return A given map variant
     */
    @GET(PATH_PREFIX + "map-variants/{id}")
    Observable<MapVariant> getMapVariant(@Path("id") String id);

    /**
     * @return A list of maps for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "maps")
    Observable<List<Map>> getMaps();

    /**
     * @return A list of medals for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "medals")
    Observable<List<Medal>> getMedals();

    /**
     * @return A list of playlists for the title. To determine which playlists a specific player has
     * played within, view the Service Record stats for that player. There is no significance
     * to the ordering.
     */
    @GET(PATH_PREFIX + "playlists")
    Observable<List<Playlist>> getPlaylists();

    /**
     * @return A list of requisition packs for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "requisition-packs")
    Observable<List<RequisitionPack>> getRequisitionPacks();

    /**
     * @param id An ID that uniquely identifies a Requisition.
     * @return A list of requisitions for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "requisitions/{id}")
    Observable<List<Requisition>> getRequisitions(@Path("id") String id);

    /**
     * @return A list of skulls for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "skulls")
    Observable<List<Skull>> getSkulls();

    /**
     * @return A list of Spartan Ranks for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "spartan-ranks")
    Observable<List<SpartanRank>> getSpartanRanks();

    /**
     * @return A listing of team colors supported in the title. There is no significance to the
     * ordering.
     */
    @GET(PATH_PREFIX + "team-colors")
    Observable<List<TeamColor>> getTeamColors();

    /**
     * @return A list of vehicles for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "vehicles")
    Observable<List<Vehicle>> getVehicles();

    /**
     * @return A listing of weapons supported in the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "weapons")
    Observable<List<Weapon>> getWeapons();
}
