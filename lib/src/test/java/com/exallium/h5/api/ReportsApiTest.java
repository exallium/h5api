package com.exallium.h5.api;

import com.exallium.h5.api.models.stats.matches.Match;
import com.exallium.h5.api.models.stats.matches.Page;
import com.exallium.h5.api.models.stats.reports.*;
import com.exallium.h5.api.utils.Constants;
import com.exallium.h5.api.utils.KeyReader;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import retrofit.Response;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(JUnit4.class)
public class ReportsApiTest extends BaseTest {
    private static String apiKey;

    private static final String PLAYER = "Vercobrixx";
    private static final List<String> MODES = Arrays.asList("warzone", "arena");

    {
        setTimeout(Constants.TIMEOUT * 2);
    }

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
        Match match = getMatchByType(stats, "arena");
        Response<VersusCarnageReport<ArenaPlayerStats>> arenaReport = stats.getArenaCarnageReport(match.getId().getMatchId()).execute();
        Assert.assertEquals(arenaReport.code(), 200);
    }

    @Test
    public void testWarzoneReport() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Stats stats = factory.getStats();
        Match match = getMatchByType(stats, "warzone");
        Response<VersusCarnageReport<WarzonePlayerStats>> warzoneReport = stats.getWarzoneCarnageReport(match.getId().getMatchId()).execute();
        Assert.assertEquals(warzoneReport.code(), 200);
    }

    @Test
    public void testCampaignReport() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Stats stats = factory.getStats();
        Match match = getMatchByType(stats, "campaign");
        Response<CampaignCarnageReport> campaignReport = stats.getCampaignCarnageReport(match.getId().getMatchId()).execute();
        Assert.assertEquals(campaignReport.code(), 200);
    }

    @Test
    public void testCustomReport() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Stats stats = factory.getStats();
        Match match = getMatchByType(stats, "custom");
        Response<VersusCarnageReport<VersusPlayerStats>> customReport = stats.getCustomCarnageReport(match.getId().getMatchId()).execute();
        Assert.assertEquals(customReport.code(), 200);
    }

    private Match getMatchByType(Stats stats, String type) throws IOException {
        Response<Page<Match>> response = stats.getRecentMatchInfo(
                PLAYER,
                Collections.singletonList(type),
                0,
                1).execute();

        Assert.assertEquals(response.code(), 200);
        Assert.assertEquals(response.body().getResultCount(), 1);
        return response.body().getResults().get(0);
    }
}
