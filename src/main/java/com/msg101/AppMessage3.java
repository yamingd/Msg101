package com.msg101;

import org.msgpack.annotation.MessagePackMessage;

import java.io.Serializable;

/**
 * Created by yaming on 14-9-5.
 */
//@MessagePackBeans
@MessagePackMessage
public class AppMessage3 implements Serializable {

    // public fields are serialized.
    private String name;
    private double version;
    private long now;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }
}
