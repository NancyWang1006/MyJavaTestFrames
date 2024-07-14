package com.nancy.ngreport;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void logDemo(){
        Reporter.log("This is our own log");
        throw new RuntimeException("自己挖坑自己埋");
    }

    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }
}
