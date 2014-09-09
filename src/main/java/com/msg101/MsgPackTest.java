package com.msg101;

import org.msgpack.MessagePack;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * Created by yaming_deng on 14-9-5.
 */
public class MsgPackTest {

    public static void start() throws IOException {

        AppMessage src = new AppMessage();
        src.name = UUID.randomUUID().toString();
        src.version = 0.6;
        src.now = new Date().getTime();

        long total = 10 * 1000;
        long t01 = System.currentTimeMillis();
        byte[] data = null;
        long sizes = 0;
        MessagePack msgpack = new MessagePack();
        for (int i = 0; i < total; i++) {
            // Serialize
            data = msgpack.write(src);
            sizes += data.length;
        }
        double ts = System.currentTimeMillis() - t01;
        System.out.println("MsgPackTest Serialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s" + " sizes=" + sizes / total);

        t01 = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            //System.out.println(i + " : " + data.length);
            // Deserialize
            AppMessage dst = msgpack.read(data, AppMessage.class);
        }
        ts = System.currentTimeMillis() - t01;
        if (ts == 0){
            ts = 0.1;
        }
        System.out.println("MsgPackTest Deserialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s");
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
        MessagePack msgpack = new MessagePack();
        for (int i = 0; i < total; i++) {
            // Serialize
            data = msgpack.write(src);
            sizes += data.length;
        }
        double ts = System.currentTimeMillis() - t01;
        System.out.println("MsgPackTest2 Serialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s" + " sizes=" + sizes / total);

        t01 = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            //System.out.println(i + " : " + data.length);
            // Deserialize
            AppMessage2 dst = msgpack.read(data, AppMessage2.class);
        }
        ts = System.currentTimeMillis() - t01;
        if (ts == 0){
            ts = 0.1;
        }
        System.out.println("MsgPackTest2 Deserialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s");
    }

    public static void start3() throws IOException {

        AppMessage src = new AppMessage();
        src.name = UUID.randomUUID().toString();
        src.version = 0.6;
        src.now = new Date().getTime();

        long total = 10 * 1000;
        long t01 = System.currentTimeMillis();
        byte[] data = null;
        long sizes = 0;
        MessagePack msgpack = new MessagePack();
        for (int i = 0; i < total; i++) {
            // Serialize
            data = msgpack.write(src);
            sizes += data.length;
        }
        double ts = System.currentTimeMillis() - t01;
        System.out.println("MsgPackTest2 Serialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s" + " sizes=" + sizes / total);

        t01 = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            //System.out.println(i + " : " + data.length);
            // Deserialize
            AppMessage2 dst = msgpack.read(data, AppMessage2.class);
        }
        ts = System.currentTimeMillis() - t01;
        if (ts == 0){
            ts = 0.1;
        }
        System.out.println("MsgPackTest2 Deserialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s");
    }
}
