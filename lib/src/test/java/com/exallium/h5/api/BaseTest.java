package com.exallium.h5.api;

import com.exallium.h5.api.utils.Constants;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    private long startTime;
    private long timeout = Constants.TIMEOUT;

    public void setTimeout(long timeout) {
        this.timeout = timeout;
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
        if (delta < timeout) {
            Thread.sleep(timeout - delta);
        }
    }

}
