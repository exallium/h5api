package com.exallium.h5.api.utils;

import com.exallium.h5.api.MetadataApiTest;

import java.io.*;
import java.net.URL;

public class KeyReader {

    private KeyReader() { }

    public static String getApiKey() {
        URL url = MetadataApiTest.class.getResource("/apiKey");
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
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
