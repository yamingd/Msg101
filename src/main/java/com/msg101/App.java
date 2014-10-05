package com.msg101;

import java.math.BigInteger;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws Exception {
        /*
        MsgPackTest.start();
        MsgPackTest.start2();

        GsonTest.start();
        GsonTest.start2();
        */

        //sizeTest();

        MsgPackTest.start4();
    }

    public static void sizeTest(){
        String a = "123";
        Integer b = 123;
        System.out.println(a.getBytes().length);
        System.out.println(BigInteger.valueOf(b).toByteArray().length);
    }

}
