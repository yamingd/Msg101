package com.msg101;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testMsgPack() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("\r\n Warm up: " + i);
            MsgPackTest.start();
            Thread.sleep(1000);

            MsgPackTest.start2();
            Thread.sleep(1000);
        }
        /*
        *
Warm up: 0
MsgPackTest Serialize duration: 266.0ms. 37593.984962406015 op/s
MsgPackTest Deserialize duration: 62.0ms. 161290.32258064515 op/s
MsgPackTest2 Serialize duration: 15.0ms. 666666.6666666666 op/s
MsgPackTest2 Deserialize duration: 32.0ms. 312500.0 op/s

 Warm up: 1
MsgPackTest Serialize duration: 15.0ms. 666666.6666666666 op/s
MsgPackTest Deserialize duration: 16.0ms. 625000.0 op/s
MsgPackTest2 Serialize duration: 31.0ms. 322580.6451612903 op/s
MsgPackTest2 Deserialize duration: 16.0ms. 625000.0 op/s

 Warm up: 2
MsgPackTest Serialize duration: 16.0ms. 625000.0 op/s
MsgPackTest Deserialize duration: 15.0ms. 666666.6666666666 op/s
MsgPackTest2 Serialize duration: 15.0ms. 666666.6666666666 op/s
MsgPackTest2 Deserialize duration: 16.0ms. 625000.0 op/s

 Warm up: 3
MsgPackTest Serialize duration: 16.0ms. 625000.0 op/s
MsgPackTest Deserialize duration: 15.0ms. 666666.6666666666 op/s
MsgPackTest2 Serialize duration: 32.0ms. 312500.0 op/s
MsgPackTest2 Deserialize duration: 0.1ms. 1.0E8 op/s

 Warm up: 4
MsgPackTest Serialize duration: 31.0ms. 322580.6451612903 op/s
MsgPackTest Deserialize duration: 0.1ms. 1.0E8 op/s
MsgPackTest2 Serialize duration: 32.0ms. 312500.0 op/s
MsgPackTest2 Deserialize duration: 15.0ms. 666666.6666666666 op/s

Process finished with exit code 0

        * */
    }

    public void testGson() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("\r\n Warm up: " + i);
            GsonTest.start();
            Thread.sleep(1000);

            GsonTest.start2();
            Thread.sleep(1000);
        }
 /*
 *  Warm up: 0
GsonTest Serialize duration: 125ms. 80000 op/s
GsonTest Deserialize duration: 63ms. 158730 op/s
GsonTest2 Serialize duration: 78ms. 128205 op/s
GsonTest2 Deserialize duration: 203ms. 49261 op/s

 Warm up: 1
GsonTest Serialize duration: 31ms. 322580 op/s
GsonTest Deserialize duration: 32ms. 312500 op/s
GsonTest2 Serialize duration: 62ms. 161290 op/s
GsonTest2 Deserialize duration: 157ms. 63694 op/s

 Warm up: 2
GsonTest Serialize duration: 31ms. 322580 op/s
GsonTest Deserialize duration: 31ms. 322580 op/s
GsonTest2 Serialize duration: 47ms. 212765 op/s
GsonTest2 Deserialize duration: 157ms. 63694 op/s

 Warm up: 3
GsonTest Serialize duration: 31ms. 322580 op/s
GsonTest Deserialize duration: 16ms. 625000 op/s
GsonTest2 Serialize duration: 47ms. 212765 op/s
GsonTest2 Deserialize duration: 157ms. 63694 op/s

 Warm up: 4
GsonTest Serialize duration: 15ms. 666666 op/s
GsonTest Deserialize duration: 32ms. 312500 op/s
GsonTest2 Serialize duration: 62ms. 161290 op/s
GsonTest2 Deserialize duration: 141ms. 70921 op/s

 * */
    }

    public void testAll() throws Exception {
        MsgPackTest.start();
        GsonTest.start();
        HessianTest.start();
    }

    public void testAll2() throws Exception {
        MsgPackTest.start2();
        GsonTest.start2();
        HessianTest.start2();
    }

    public void testHessian() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("\r\n Warm up: " + i);
            HessianTest.start();
            Thread.sleep(1000);

            HessianTest.start2();
            Thread.sleep(1000);
        }
    }

    public void testMsgpack3() throws Exception {
        MsgPackTest.start3();
    }
}
