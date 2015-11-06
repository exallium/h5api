package com.exallium.h5.api;

import com.exallium.h5.api.utils.Constants;
import com.exallium.h5.api.utils.KeyReader;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import retrofit.Response;

import java.io.IOException;

public class ProfileApiTest extends BaseTest {

    private static final String PLAYER = "Vercobrixx";

    private static String apiKey;
    private long startTime;

    @BeforeClass
    public static void setUpClass() {
        apiKey = KeyReader.getApiKey();
    }

    @Test
    public void testEmblem() throws IOException {
        ApiFactory apiFactory = new ApiFactory(apiKey);
        Profile profile = apiFactory.getProfile();
        Response<Void> response = profile.getEmblem(PLAYER, 512).execute();

        Assert.assertEquals(302, response.code());
    }

    @Test
    public void testSpartan() throws IOException {
        ApiFactory apiFactory = new ApiFactory(apiKey);
        Profile profile = apiFactory.getProfile();
        Response<Void> response = profile.getSpartan(PLAYER, 512, null).execute();

        Assert.assertEquals(302, response.code());
    }
}
