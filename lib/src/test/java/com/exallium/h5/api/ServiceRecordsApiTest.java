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

import com.exallium.h5.api.models.stats.servicerecords.*;
import com.exallium.h5.api.utils.KeyReader;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import retrofit.Response;

import java.io.IOException;
import java.util.Collections;

@RunWith(JUnit4.class)
public class ServiceRecordsApiTest extends BaseTest {

    private static String apiKey;

    private static final String PLAYER = "Vercobrixx";

    @BeforeClass
    public static void setUpClass() {
        apiKey = KeyReader.getApiKey();
    }

    @Test
    public void testWarzoneServiceRecord() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Stats stats = factory.getStats();
        Response<ServiceRecordCollection<WarzoneResult>> response = stats
                .getWarzoneServiceRecords(PLAYER)
                .execute();

        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testArenaServiceRecord() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Stats stats = factory.getStats();
        Response<ServiceRecordCollection<ArenaResult>> response = stats
                .getArenaServiceRecords(PLAYER)
                .execute();

        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testCustomServiceRecord() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Stats stats = factory.getStats();
        Response<ServiceRecordCollection<CustomResult>> response = stats
                .getCustomServiceRecords(PLAYER)
                .execute();

        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testCampaignServiceRecord() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Stats stats = factory.getStats();
        Response<ServiceRecordCollection<CampaignResult>> response = stats
                .getCampaignServiceRecords(PLAYER)
                .execute();

        Assert.assertEquals(200, response.code());
    }
}
