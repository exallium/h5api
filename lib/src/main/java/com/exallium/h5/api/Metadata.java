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

package com.exallium.h5.api;

import com.exallium.h5.api.models.metadata.*;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

import java.util.List;

public interface Metadata {

    String PATH_PREFIX = "/metadata/h5/metadata/";

    /**
     * @return A listing of campaign missions supported in the title. There is no significance to the
     * ordering.
     */
    @GET(PATH_PREFIX + "campaign-missions")
    Call<List<CampaignMission>> getCampaignMissions();

    /**
     * @return A list of commendations for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "commendations")
    Call<List<Commendation>> getCommendations();

    /**
     * A list of Csr designations for the title. Csr stands for Competitive Skill Rank. Csr
     * is organized into a series of designations, each with a set of tiers within the
     * designation. The designations are: Iron, Bronze, Silver, Gold, Onyx, and Pro. Within
     * each designation are tiers, for example, Bronze 1, Bronze 2, Bronze 3, etc. The Pro
     * designation is special. It has only one tier. For Pro players, we show users a ranking
     * value instead of the tier indicator. For non-Pro players, we keep the absolute skill
     * ranking hidden and show the Csr tier. To determine what Csr a player has earned, view
     * the Service Record stats for that player. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "csr-designations")
    Call<List<CSRDesignation>> getCSRDesignations();

    /**
     * @return A list of enemies for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "enemies")
    Call<List<Enemy>> getEnemies();

    /**
     * @return A list of defined flexible stat entries for the title. There is no significance to the
     * ordering.
     */
    @GET(PATH_PREFIX + "flexible-stats")
    Call<List<FlexibleStat>> getFlexibleStats();

    /**
     * @return A list of game base variants for the title. There is no mechanism to determine which
     * game base variants are currently available for play. To determine which game base
     * variants a specific player has played, view the Service Record stats for that
     * player.There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "game-base-variants")
    Call<List<GameBaseVariant>> getGameBaseVariants();

    /**
     * @param id An id of a specific game variant
     * @return A list of game variants for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "game-variants/{id}")
    Call<GameVariant> getGameVariant(@Path("id") String id);

    /**
     * @return A list of impulses (essentially invisible medals) for the title. There is no
     * significance to the ordering.
     */
    @GET(PATH_PREFIX + "impulses")
    Call<List<Impulse>> getImpulses();

    /**
     * @param id Unique Map Variant ID
     * @return A given map variant
     */
    @GET(PATH_PREFIX + "map-variants/{id}")
    Call<MapVariant> getMapVariant(@Path("id") String id);

    /**
     * @return A list of maps for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "maps")
    Call<List<Map>> getMaps();

    /**
     * @return A list of medals for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "medals")
    Call<List<Medal>> getMedals();

    /**
     * @return A list of playlists for the title. To determine which playlists a specific player has
     * played within, view the Service Record stats for that player. There is no significance
     * to the ordering.
     */
    @GET(PATH_PREFIX + "playlists")
    Call<List<Playlist>> getPlaylists();

    /**
     * @param id The unique id of the req pack
     * @return A Requisition pack for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "requisition-packs/{id}")
    Call<RequisitionPack> getRequisitionPack(@Path("id") String id);

    /**
     * @param id An ID that uniquely identifies a Requisition.
     * @return A requisition for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "requisitions/{id}")
    Call<Requisition> getRequisition(@Path("id") String id);

    /**
     * @return A list of skulls for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "skulls")
    Call<List<Skull>> getSkulls();

    /**
     * @return A list of Spartan Ranks for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "spartan-ranks")
    Call<List<SpartanRank>> getSpartanRanks();

    /**
     * @return A listing of team colors supported in the title. There is no significance to the
     * ordering.
     */
    @GET(PATH_PREFIX + "team-colors")
    Call<List<TeamColor>> getTeamColors();

    /**
     * @return A list of vehicles for the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "vehicles")
    Call<List<Vehicle>> getVehicles();

    /**
     * @return A listing of weapons supported in the title. There is no significance to the ordering.
     */
    @GET(PATH_PREFIX + "weapons")
    Call<List<Weapon>> getWeapons();
}
