package com.msg101;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * Created by yaming_deng on 14-9-5.
 */
public class GsonTest {

    public static void start() throws IOException {

        AppMessage src = new AppMessage();
        src.name = UUID.randomUUID().toString();
        src.version = 0.6;
        src.now = new Date().getTime();

        long total = 10 * 1000;
        long t01 = System.currentTimeMillis();
        byte[] data = null;
        long sizes = 0;
        Gson gson = new Gson();
        for (int i = 0; i < total; i++) {
            // Serialize
            data = gson.toJson(src).getBytes();
            sizes += data.length;
        }
        long ts = System.currentTimeMillis() - t01;
        System.out.println("GsonTest Serialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s" + " sizes=" + sizes / total);

        t01 = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            //System.out.println(i + " : " + data.length);
            // Deserialize
            AppMessage dst = gson.fromJson(new String(data), AppMessage.class);
        }
        ts = System.currentTimeMillis() - t01;
        System.out.println("GsonTest Deserialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s");

    }

    public static void start2() throws IOException {

        AppMessage2 src = new AppMessage2();
        src.name = UUID.randomUUID().toString();
        src.version = 0.6;
        src.now = new Date().getTime();
        src.createAt = new Date();

        long total = 10 * 1000;
        long t01 = System.currentTimeMillis();
        byte[] data = null;
        long sizes = 0;
        Gson gson = new Gson();
        for (int i = 0; i < total; i++) {
            // Serialize
            data = gson.toJson(src).getBytes();
            sizes += data.length;
        }
        long ts = System.currentTimeMillis() - t01;
        System.out.println("GsonTest Serialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s" + " sizes=" + sizes / total);

        t01 = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            //System.out.println(i + " : " + data.length);
            // Deserialize
            AppMessage2 dst = gson.fromJson(new String(data), AppMessage2.class);
        }
        ts = System.currentTimeMillis() - t01;
        System.out.println("GsonTest2 Deserialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s");

    }

}
