package com.msg101;

import org.msgpack.annotation.Message;

import java.util.Date;

/**
 * Created by yaming_deng on 14-9-5.
 */
@Message
public class AppMessage2 extends AppMessage {

    // date field
    // will slow Gson down. but msgpack is the same as before.
    public Date createAt;
}
