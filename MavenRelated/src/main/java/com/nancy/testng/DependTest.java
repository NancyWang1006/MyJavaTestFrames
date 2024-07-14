package com.nancy.testng;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){

        System.out.println("This is test1 running!");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("Test 2 is running!");
    }
}
