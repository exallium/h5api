package com.exallium.h5.api;

import com.exallium.h5.api.models.stats.matches.Match;
import com.exallium.h5.api.models.stats.matches.Page;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

import java.util.List;

public interface Stats {

    @GET("/stats/h5/players/{player}/matches")
    Call<Page<Match>> getRecentMatchInfo(@Path("player") String player,
                                         @Query("modes") List<String> modes,
                                         @Query("start") int start,
                                         @Query("count") int count);
}
