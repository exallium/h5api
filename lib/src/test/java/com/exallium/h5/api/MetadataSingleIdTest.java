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

import com.exallium.h5.api.models.metadata.Commendation;
import com.exallium.h5.api.models.metadata.GameVariant;
import com.exallium.h5.api.models.metadata.MapVariant;
import com.exallium.h5.api.models.metadata.RequisitionPack;
import com.exallium.h5.api.models.stats.matches.Match;
import com.exallium.h5.api.models.stats.matches.Page;
import com.exallium.h5.api.models.stats.reports.ArenaPlayerStats;
import com.exallium.h5.api.models.stats.reports.VersusCarnageReport;
import com.exallium.h5.api.utils.Constants;
import com.exallium.h5.api.utils.KeyReader;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import retrofit.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * Tests metadata endpoints which require an ID to be sent
 */
@RunWith(JUnit4.class)
public class MetadataSingleIdTest extends BaseTest {
    private static String apiKey;

    {
        setTimeout(Constants.TIMEOUT * 3);
    }

    @BeforeClass
    public static void setUpClass() {
        apiKey = KeyReader.getApiKey();
    }

    @Test
    public void testGetGameVariant() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Stats stats = factory.getStats();

        // Get most recent match
        Match match = getMatchByType(stats, "arena");
        Response<VersusCarnageReport<ArenaPlayerStats>> arenaReport = stats
                .getArenaCarnageReport(match.getId().getMatchId())
                .execute();
        Assert.assertEquals(arenaReport.code(), 200);

        VersusCarnageReport<ArenaPlayerStats> report = arenaReport.body();
        String id = report.getGameVariantId();

        Metadata metadata = factory.getMetadata();
        Response<GameVariant> gVResponse = metadata.getGameVariant(id).execute();

        Assert.assertEquals(200, gVResponse.code());
    }

    @Test
    public void testGetMapVariant() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Stats stats = factory.getStats();

        // Get most recent match
        Match match = getMatchByType(stats, "arena");
        Response<VersusCarnageReport<ArenaPlayerStats>> arenaReport = stats
                .getArenaCarnageReport(match.getId().getMatchId())
                .execute();
        Assert.assertEquals(arenaReport.code(), 200);

        VersusCarnageReport<ArenaPlayerStats> report = arenaReport.body();
        String id = report.getMapVariantId();

        Metadata metadata = factory.getMetadata();
        Response<MapVariant> mVResponse = metadata.getMapVariant(id).execute();

        Assert.assertEquals(200, mVResponse.code());
    }

    @Test
    public void testGetRequisitionPack() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();

        Response<List<Commendation>> commendationsResponse = metadata.getCommendations().execute();
        Assert.assertEquals(200, commendationsResponse.code());

        List<Commendation> comms = commendationsResponse.body();
        Assert.assertNotEquals(0, comms.size());

        RequisitionPack pack = null;
        for (Commendation comm : comms) {

            if (comm.getReward() == null) {
                continue;
            }

            if (comm.getReward().getRequisitionPacks() == null) {
                continue;
            }

            if (comm.getReward().getRequisitionPacks().size() != 0) {
                pack = comm.getReward().getRequisitionPacks().get(0);
                break;
            }
        }
        Assert.assertNotNull(pack);

        String packId = pack.getId();
        Response<RequisitionPack> rpResponse = metadata.getRequisitionPack(packId).execute();
        Assert.assertEquals(200, rpResponse.code());

    }

    @Test
    public void testGetRequisition() {
        // TODO
    }

    private Match getMatchByType(Stats stats, String type) throws IOException {
        Response<Page<Match>> response = stats.getRecentMatchInfo(
                Constants.PLAYER,
                type,
                0,
                1).execute();

        Assert.assertEquals(response.code(), 200);
        Assert.assertEquals(response.body().getResultCount(), 1);
        return response.body().getResults().get(0);
    }
}
