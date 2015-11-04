package com.exallium.h5.api;

import com.exallium.h5.api.models.metadata.Weapon;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CountDownLatch;

@RunWith(JUnit4.class)
public class ApiTest {

    private static String apiKey;

    @BeforeClass
    public static void setUpClass() {
        URL url = ApiTest.class.getResource("/secure/apiKey");
        File apiFile = new File(url.getFile());
        try {
            FileInputStream inputStream = new FileInputStream(apiFile);
            Reader r = new InputStreamReader(inputStream, "UTF-8");
            StringBuilder sb = new StringBuilder();
            char[] buf = new char[1024];
            int amt = r.read(buf);
            while (amt > 0) {
                sb.append(buf, 0, amt);
                amt = r.read(buf);
            }
            apiKey = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWeapons() throws InterruptedException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();

        final CountDownLatch latch = new CountDownLatch(1);

        metadata.getWeapons().enqueue(new Callback<List<Weapon>>() {
            @Override
            public void onResponse(Response<List<Weapon>> response, Retrofit retrofit) {
                System.out.println(response.body());
                latch.countDown();
            }

            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
                latch.countDown();
            }
        });

        latch.await();
    }
}
