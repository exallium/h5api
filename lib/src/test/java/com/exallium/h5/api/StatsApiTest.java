package com.exallium.h5.api;

import com.exallium.h5.api.models.stats.matches.Match;
import com.exallium.h5.api.models.stats.matches.Page;
import com.exallium.h5.api.models.stats.reports.ArenaPlayerStats;
import com.exallium.h5.api.models.stats.reports.VersusCarnageReport;
import com.exallium.h5.api.utils.KeyReader;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import retrofit.Response;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(JUnit4.class)
public class StatsApiTest {
    private static String apiKey;

    private static final String PLAYER = "exallium";
    private static final List<String> MODES = Arrays.asList("warzone", "arena");

    @BeforeClass
    public static void setUpClass() {
        apiKey = KeyReader.getApiKey();
    }

    @Test
    public void testRecentMatchInfo() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Stats stats = factory.getStats();
        Response<Page<Match>> response = stats.getRecentMatchInfo(PLAYER, MODES, 0, 20).execute();
        Assert.assertEquals(response.code(), 200);
    }

    @Test
    public void testArenaReport() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Stats stats = factory.getStats();
        Response<Page<Match>> response = stats.getRecentMatchInfo(
                PLAYER,
                Collections.singletonList("arena"),
                0,
                1).execute();

        Assert.assertEquals(response.code(), 200);
        Assert.assertEquals(response.body().getResultCount(), 1);

        Match match = response.body().getResults().get(0);

        Response<VersusCarnageReport<ArenaPlayerStats>> arenaReport = stats.getArenaCarnageReport(match.getId().getMatchId()).execute();

        Assert.assertEquals(response.code(), 200);
    }
}
