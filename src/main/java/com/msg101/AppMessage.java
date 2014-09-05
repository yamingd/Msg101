package com.msg101;

import org.msgpack.annotation.Message;

import java.io.Serializable;

/**
 * Created by yaming on 14-9-5.
 */
@Message
public class AppMessage implements Serializable {

    // public fields are serialized.
    public String name;
    public double version;
    public long now;

}
