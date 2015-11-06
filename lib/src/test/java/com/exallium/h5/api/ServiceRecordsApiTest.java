package com.exallium.h5.api;

import com.exallium.h5.api.models.stats.servicerecords.ArenaResult;
import com.exallium.h5.api.models.stats.servicerecords.ServiceRecordCollection;
import com.exallium.h5.api.models.stats.servicerecords.WarzoneResult;
import com.exallium.h5.api.models.stats.servicerecords.WarzoneStat;
import com.exallium.h5.api.utils.KeyReader;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import retrofit.Response;

import java.io.IOException;
import java.util.Collections;

@RunWith(JUnit4.class)
public class ServiceRecordsApiTest {

    private static String apiKey;

    private static final String PLAYER = "Vercobrixx";

    private long startTime;

    @BeforeClass
    public static void setUpClass() {
        apiKey = KeyReader.getApiKey();
    }

    @Before
    public void setUp() {
        startTime = System.currentTimeMillis();
    }

    @After
    public void tearDown() throws InterruptedException {
        long endTime = System.currentTimeMillis();
        long delta = endTime - startTime;
        System.out.println(String.format("Test took %d ms", delta));
        if (delta < 1100) {
            Thread.sleep(1100 - delta);
        }
    }

    @Test
    public void testWarzoneServiceRecord() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Stats stats = factory.getStats();
        Response<ServiceRecordCollection<WarzoneResult>> response = stats
                .getWarzoneServiceRecords(Collections.singletonList(PLAYER))
                .execute();

        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testArenaServiceRecord() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Stats stats = factory.getStats();
        Response<ServiceRecordCollection<ArenaResult>> response = stats
                .getArenaServiceRecords(Collections.singletonList(PLAYER))
                .execute();

        Assert.assertEquals(200, response.code());
    }
}
