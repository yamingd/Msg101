package com.msg101;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * Created by yaming_deng on 14-9-5.
 */
public class HessianTest {

    public static void start() throws IOException {

        AppMessage src = new AppMessage();
        src.name = UUID.randomUUID().toString();
        src.version = 0.6;
        src.now = new Date().getTime();

        long total = 10 * 1000;
        long t01 = System.currentTimeMillis();
        byte[] data = null;
        long sizes = 0;

        for (int i = 0; i < total; i++) {
            // Serialize
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            Hessian2Output out = new Hessian2Output(bos);
            out.startMessage();
            out.writeObject(src);
            out.completeMessage();
            out.close();
            data = bos.toByteArray();
            sizes += data.length;
        }
        long ts = System.currentTimeMillis() - t01;
        System.out.println("HessianTest Serialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s" + " sizes=" + sizes / total);

        t01 = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            //System.out.println(i + " : " + data.length);
            // Deserialize
            ByteArrayInputStream bin = new ByteArrayInputStream(data);
            Hessian2Input in = new Hessian2Input(bin);
            in.startMessage();
            AppMessage dst = (AppMessage)in.readObject();
            in.completeMessage();
            in.close();
            bin.close();
        }
        ts = System.currentTimeMillis() - t01;
        System.out.println("HessianTest Deserialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s");

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

        for (int i = 0; i < total; i++) {
            // Serialize
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            Hessian2Output out = new Hessian2Output(bos);
            out.startMessage();
            out.writeObject(src);
            out.completeMessage();
            out.close();
            data = bos.toByteArray();
            sizes += data.length;
        }
        long ts = System.currentTimeMillis() - t01;
        System.out.println("HessianTest Serialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s" + " sizes=" + sizes / total);

        t01 = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            //System.out.println(i + " : " + data.length);
            // Deserialize
            ByteArrayInputStream bin = new ByteArrayInputStream(data);
            Hessian2Input in = new Hessian2Input(bin);
            in.startMessage();
            AppMessage dst = (AppMessage)in.readObject();
            in.completeMessage();
            in.close();
            bin.close();
        }
        ts = System.currentTimeMillis() - t01;
        System.out.println("HessianTest Deserialize duration: " + ts + "ms. " + 1000 * total / ts + " op/s");

    }

}
