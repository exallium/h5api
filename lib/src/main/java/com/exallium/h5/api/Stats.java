package com.exallium.h5.api;

import com.exallium.h5.api.models.stats.matches.Match;
import com.exallium.h5.api.models.stats.matches.Page;
import com.exallium.h5.api.models.stats.reports.ArenaPlayerStats;
import com.exallium.h5.api.models.stats.reports.VersusCarnageReport;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

import java.util.List;

public interface Stats {

    /**
     * Retrieves a list of matches that the player has participated in
     * and which have completed processing. If the player is currently
     * in a match, it is not returned in this API. Matches will usually
     * appear in this list within a minute of the match ending.
     * @param player    The Player's gamertag.
     * @param modes     warzone, custom, arena, or campaign
     * @param start     Start offset
     * @param count     # results to return
     * @return
     */
    @GET("/stats/h5/players/{player}/matches")
    Call<Page<Match>> getRecentMatchInfo(@Path("player") String player,
                                         @Query("modes") List<String> modes,
                                         @Query("start") int start,
                                         @Query("count") int count);

    /**
     * Retrieves detailed statistics for a match.
     * Some match details are available while the match is in-progress,
     * but the behavior for incomplete matches in undefined.
     * @param matchId An ID that uniquely identifies a match. Match IDs
     *                can be retrieved from the "GET Matches for Player" API.
     * @return Call object for desired report
     */
    @GET("/stats/h5/arena/matches/{matchId}")
    Call<VersusCarnageReport<ArenaPlayerStats>> getArenaCarnageReport(@Path("matchId") String matchId);
}
